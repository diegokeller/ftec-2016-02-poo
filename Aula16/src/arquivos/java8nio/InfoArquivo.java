package arquivos.java8nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class InfoArquivo {

	public static void main(String[] args) {

		// Uma pasta com vários níveis
		Path path = Paths.get("C:/Users/Diego/Downloads");

		// Informações da pasta
		System.out.format("toString %s%n", path.toString());
		System.out.format("getFileName %s%n", path.getFileName());
		System.out.format("getName %s%n", path.getName(0));
		System.out.format("getNameCount %s%n", path.getNameCount());
		System.out.format("subpath(0,2) %s%n", path.subpath(0, 2));
		System.out.format("getParent %s%n", path.getParent());
		System.out.format("getRoot %s%n", path.getRoot());
		
		// Um arquivo local
		Path local = Paths.get("teste.txt");
		System.out.println(local.toAbsolutePath());

	}

}
