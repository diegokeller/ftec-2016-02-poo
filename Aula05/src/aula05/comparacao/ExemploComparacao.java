package aula05.comparacao;

public class ExemploComparacao {

	public static void main(String[] args) {

		String nome1 = new String("Maria");
		String nome2 = new String("Maria");

		if (nome1 == nome2) {
			System.out.println("Os nomes são IGUAIS");
		} else {
			System.out.println("Os nomes são DIFERENTES");
		}

		String nome3 = nome2;

		if (nome3 == nome2) {
			System.out.println("Os nomes são IGUAIS");
		} else {
			System.out.println("Os nomes são DIFERENTES");
		}

		// Comparar o conteúdo
		if (nome1.equals(nome2)) {
			System.out
					.println("Os nomes são IGUAIS usando equals");
		} else {
			System.out
					.println("Os nomes são DIFERENTES usando equals");
		}

	}

}
