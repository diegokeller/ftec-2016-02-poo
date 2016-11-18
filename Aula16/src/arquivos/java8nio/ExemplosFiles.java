package arquivos.java8nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ExemplosFiles {

	public static void main(String[] args) {

		// Escrever um arquivo - Autoclosable
		try (BufferedWriter writer = 
				Files.newBufferedWriter(
						Paths.get("autoclose2.txt"), 
						Charset.forName("UTF-8"), 
						StandardOpenOption.TRUNCATE_EXISTING)) {
			// Escrevendo no arquivo
			writer.write("Teste Teste Teste - Banana\n");
			writer.write("Teste Teste Teste - Banana");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

		// Apagar um arquivo
		try {
			Files.deleteIfExists(Paths.get("criar_arquivo.txt"));
		} catch (IOException e1) {
			System.out.println("Erro ao excluir arquivo.");
		}

		// Criar um arquivo
		try {
			Files.createFile(Paths.get("criar_arquivo.txt"));
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo.");
		}

		// Criar um diretório
		try {
			Files.createDirectories(Paths.get("pasta_doc"));
		} catch (IOException e) {
			System.out.println("Erro ao criar pasta.");
		}

		// Copiar arquivo
		Path origem = Paths.get("criar_arquivo.txt");
		Path destino = Paths.get("copia.txt");
		try {
			Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Erro ao copiar arquivo.");
		}

		// Mover arquivo
		origem = Paths.get("copia.txt");
		destino = Paths.get("pasta_doc/copia.txt");
		try {
			Files.move(origem, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println("Erro ao copiar arquivo.");
		}

		// Listar arquivos de uma pasta
		Path pasta = Paths.get(".");
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(pasta);
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException e) {
			System.out.println("Erro ao listar arquivos.");
		}

		// Ler todas as linhas de um arquivo
		try {
			List<String> linhas = Files.readAllLines(Paths.get("teste.txt"));
			System.out.println(linhas);
		} catch (IOException e) {
			System.out.println("Erro ao ler linhas.");
		}
		

	}

}
