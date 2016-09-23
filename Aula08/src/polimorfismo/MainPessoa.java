package polimorfismo;

public class MainPessoa {

	public static void main(String[] args) {

		// Cria uma pessoa
		// Não pode pois é abstrato
		// Pessoa p1 = new Pessoa("João");

		// Cria uma pessoa física
		PessoaFisica p2 = new PessoaFisica("Carlos",
				"123.456.789-10");
		Pessoa p21 = p2;
		System.out.println(p2.getCpf());

		// Cria uma pessoa jurídica
		PessoaJuridica p3 = new PessoaJuridica("ACME",
				"789456/001-23");
		Pessoa p4 = new PessoaJuridica("AMCE", "123");

		// Tratando objetos diferentes de uma forma comum
		Pessoa[] destinatarios = new Pessoa[] { p2, p21, p3,
				p4 };
		for (Pessoa pessoa : destinatarios) {
			System.out.println(pessoa.getNome());
			// Essa pessoa é física ou jurídica?
			if (pessoa instanceof PessoaFisica) {
				System.out.println("É pessoa física");
			}
			if (pessoa instanceof PessoaJuridica) {
				System.out.println("É pessoa jurídica");
			}
		}
	}

}
