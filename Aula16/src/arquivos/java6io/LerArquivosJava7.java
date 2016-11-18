package arquivos.java6io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivosJava7 {

	public static void main(String[] args) {
		try {
			Path caminho = Paths.get("c:\\teste.txt");
			List<String> linhas = Files
					.readAllLines(caminho, Charset.forName("Cp1252"));
			System.out.println(linhas);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao ler linhas.");
		}
	}

}
