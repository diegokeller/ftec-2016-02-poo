package conta_bancaria;

public class MainContaBancaria {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria("João", 123, 456);
		ContaBancariaGold c2 = new ContaBancariaGold("Maria",
				789, 101);
		ContaBancariaPlatinum c3 = new ContaBancariaPlatinum(
				"Carlos", 147, 258);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		c1.sacar(50f);
		c1.depositar(100f);
		c1.sacar(70f);

		c2.depositar(200f);
		c2.sacar(25f);

		System.out.println(c1);
		System.out.println(c2);
		c3.solicitarCheque("Rua das margaridas");

		// Atributos estáticos tem o mesmo valor para todos os objetos
		// criados a partir dessa classe
		System.out.println(ContaBancaria.BANCO);
		// Atrobutos "final" não podem ser alterados
		// Dá erro de compilação
		// c1.BANCO = "BANCO XYZ";
		System.out.println(c2.BANCO);

	}

}
