package arquivos.java6io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivoJava6 {

	public static void main(String[] args) {
		BufferedReader leitor = null;
		String linha;
		try {
			leitor = new BufferedReader(
					new FileReader("C:\\teste.txt"));
			while ((linha = leitor.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
