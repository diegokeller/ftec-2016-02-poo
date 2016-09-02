package aula05.comparacao;

public class Cliente {

	private Integer cpf;
	private String nome;

	public Cliente(Integer cpf, String nome) {
		super();
		System.out.println("Criando um cliente");
		this.cpf = cpf;
		this.nome = nome;
	}

	public Cliente(String nome, Integer cpf) {
		super();
		System.out.println("Criando um cliente");
		this.cpf = cpf;
		this.nome = nome;
	}

	public Cliente(String nome) {
		super();
		System.out.println("Criando um cliente");
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

}
