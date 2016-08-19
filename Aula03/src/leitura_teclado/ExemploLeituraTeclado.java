package leitura_teclado;

import java.io.IOException;
import java.util.Scanner;

public class ExemploLeituraTeclado {

	public static void main(String[] args)
			throws IOException {

		Scanner leitor = new Scanner(System.in);

		char c = (char) System.in.read();
		System.out.println(c);

		char c2 = leitor.next().charAt(0);

		// Ler uma string
		System.out.println("Digite seu nome:");
		String nome = leitor.nextLine();

		// Ler um número inteiro
		System.out.println("Digite sua idade:");
		int numero = leitor.nextInt();
		leitor.nextLine();

		// Ler um número float
		System.out.println("Digite seu salário:");
		float salario = leitor.nextFloat();
		leitor.nextLine();

		System.out.println(nome);
		System.out.println(numero);
		System.out.println(salario);

		// Fecha o leitor
		leitor.close();
	}

}
