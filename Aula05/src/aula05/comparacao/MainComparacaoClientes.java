package aula05.comparacao;

public class MainComparacaoClientes {

	public static void main(String[] args) {

		Cliente c1 = new Cliente(12345678, "Maria");

		Cliente c2 = new Cliente("Maria", 12345678);

		System.out.println("Clientes iguais? " + c1.equals(c2));
		System.out.println(c1.hashCode());

	}

}
