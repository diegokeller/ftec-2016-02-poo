package aula05.exercicio_calculo_aco;

import java.util.Scanner;

public class Leitura {

	private Integer larguraChapa;
	private Integer larguraDesejada;

	private Scanner leitor;

	public Integer getLarguraChapa() {
		return larguraChapa;
	}

	public Integer getLarguraDesejada() {
		return larguraDesejada;
	}

	public void lerParametros() {

		leitor = new Scanner(System.in);

		System.out.println("Informe a largura da chapa:");
		larguraChapa = leitor.nextInt();
		leitor.nextLine();

		System.out.println("Informe a largura desejada:");
		larguraDesejada = leitor.nextInt();
		leitor.nextLine();

		leitor.close();
	}

}
