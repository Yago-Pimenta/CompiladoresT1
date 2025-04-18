package br.ufscar.dc.compiladores.meu.lexico;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Principal {

    public static void main(String[] argumentos) {
        if (argumentos.length != 2) {
            System.err.println("Utilização: java Principal <arquivo_de_entrada> <arquivo_de_saida>");
            return;
        }

        String arquivoEntrada = argumentos[0];
        String arquivoSaida = argumentos[1];

        try {
            Path caminhoDoArquivo = Paths.get(arquivoEntrada);
            CharStream fluxoDeCaracteres = CharStreams.fromPath(caminhoDoArquivo, StandardCharsets.UTF_8);
            MeuLexer analisadorLexical = new MeuLexer(fluxoDeCaracteres);

            StringBuilder bufferDeSaida = new StringBuilder();
            Token tokenCorrente;
            boolean erroDetectado = false;

            while ((tokenCorrente = analisadorLexical.nextToken()).getType() != Token.EOF) {
                String tipoDoToken = analisadorLexical.getVocabulary().getDisplayName(tokenCorrente.getType());

                if ("CADEIA_NAO_FECHADA".equals(tipoDoToken)) {
                    bufferDeSaida.append("Linha ")
                                 .append(tokenCorrente.getLine())
                                 .append(": literal de cadeia nao finalizada")
                                 .append(System.lineSeparator());
                    erroDetectado = true;
                    break;
                } else if ("COMENTARIO_NAO_FECHADO".equals(tipoDoToken)) {
                    bufferDeSaida.append("Linha ")
                                 .append(tokenCorrente.getLine())
                                 .append(": bloco de comentario aberto e nao fechado")
                                 .append(System.lineSeparator());
                    erroDetectado = true;
                    break;
                } else if ("SimboloNaoIdentificado".equals(tipoDoToken)) {
                    bufferDeSaida.append("Linha ")
                                 .append(tokenCorrente.getLine())
                                 .append(": ")
                                 .append(tokenCorrente.getText())
                                 .append(" - simbolo nao reconhecido")
                                 .append(System.lineSeparator());
                    erroDetectado = true;
                    break;
                } else {
                    String representacaoToken = String.format("<'%s',%s>", tokenCorrente.getText(), tipoDoToken);
                    bufferDeSaida.append(representacaoToken).append(System.lineSeparator());
                }
            }

            try (FileOutputStream arquivoDeDestino = new FileOutputStream(arquivoSaida)) {
                arquivoDeDestino.write(bufferDeSaida.toString().getBytes(StandardCharsets.UTF_8));
            }

            if (erroDetectado) {
                System.exit(1); // Sinaliza erro léxico
            }

        } catch (IOException falhaAnalise) {
            System.err.println("Ocorreu uma falha na analise: " + falhaAnalise.getMessage());
            System.exit(1); // Sinaliza erro ao processar o arquivo
        }
    }
}
