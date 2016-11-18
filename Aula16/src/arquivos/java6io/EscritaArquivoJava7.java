package arquivos.java6io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EscritaArquivoJava7 {

	public static void main(String[] args) {
		// Escrever um arquivo - Autoclosable
		// Usando o try-with-resources
		try (BufferedWriter writer = Files.newBufferedWriter(
				Paths.get("c:\\teste.txt"), //Caminho do arquivo
				Charset.forName("UTF-8"), //Codificação de caracteres
				StandardOpenOption.TRUNCATE_EXISTING)) { //Sobrescrever 
			writer.write("Teste Teste Teste - Banana\n");
			writer.write("Teste Teste Teste - Banana");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
