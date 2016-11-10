package excecoes;

import util.SaldoInsuficienteException;
import util.Utilidades;

public class MainTesteExcecoes {

	public static void main(String[] args)  {
		// =======================================
		// Exceções NÃO Verificadas
		// =======================================
		
		// Divisões por zero são não verificadas
		// java.lang.ArithmeticException herda de RuntimeException
		// float a = 5 /0;

		// Acessar uma posição do vetor que não existe é um
		// erro de programação. É uma exceção não verificada.
		// ArrayIndexOutOfBoundsException herda de RuntimeException
		// int[] numeros = new int[10];
		// numeros[15] = 123;
		
		// =======================================
		// Exceções Verificadas
		// =======================================
		
		// Tentar sacar um valor maior do que o saldo da conta
		Utilidades u = new Utilidades();
		
		try {
			// Vamos tentar fazer isso
			u.sacar(110);
		} catch (SaldoInsuficienteException e) {
			// Se não der certo, vamos fazer isso
//			e.printStackTrace();
//			System.out.println("Não há saldo, tente um valor menor.");
			e.printStackTrace();
		}

	}

}
