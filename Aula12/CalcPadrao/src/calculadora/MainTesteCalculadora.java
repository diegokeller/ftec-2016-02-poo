package calculadora;

import china.CalculadoraDaChina;

public class MainTesteCalculadora {

	public static void main(String[] args) {
		CalculadoraPadrao calc = new CalculadoraDaChina();

		System.out.println(calc.somar(2, 4));
		System.out.println(calc.dividir(8, 4));
		System.out.println(calc.subtrair(10, 4));
		System.out.println(calc.multiplicar(2, 6));
	}

}
