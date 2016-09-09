package strings;

public class Pessoa {

	private String nome;
	private Integer idade;

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Meu nome é: " + nome + ". Tenho " + idade
				+ " anos.";
	}

}
