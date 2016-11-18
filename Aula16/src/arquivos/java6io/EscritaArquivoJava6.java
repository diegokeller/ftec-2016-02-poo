package arquivos.java6io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivoJava6 {
	public static void main(String[] args) {
		BufferedWriter escritor = null;
		try {
			escritor = new BufferedWriter(
					new FileWriter("C:\\teste.txt"));
			escritor.write("LINHA 1\n");
			escritor.write("LINHA 2\n");
			escritor.write("LINHA 3\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				escritor.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
