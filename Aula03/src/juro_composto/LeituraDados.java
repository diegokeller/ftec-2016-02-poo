package juro_composto;

import java.util.Scanner;

public class LeituraDados {

	static Scanner leitor = new Scanner(System.in);

	private static float lerValorFloat(String nomeCampo) {
		System.out.println("Informe " + nomeCampo + ":");
		float valor = leitor.nextFloat();
		return valor;
	}

	public static float lerTaxa() {
		return lerValorFloat("Taxa de Juros");
	}

	public static float lerValorFinanciado() {
		return lerValorFloat("Valor Financiado");
	}

	public static float lerPrazo() {
		return lerValorFloat("Prazo de Pagamento");
	}

}
