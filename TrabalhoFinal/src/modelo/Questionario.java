package modelo;

import java.time.LocalDateTime;

public class Questionario {

	private Integer codigo;
	private String nome;
	private LocalDateTime dataDeCriacao;

	public Questionario(Integer codigo, String nome,
			LocalDateTime dataDeCriacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataDeCriacao = dataDeCriacao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(
			LocalDateTime dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataDeCriacao == null) ? 0
				: dataDeCriacao.hashCode());
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
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
		Questionario other = (Questionario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataDeCriacao == null) {
			if (other.dataDeCriacao != null)
				return false;
		} else if (!dataDeCriacao.equals(other.dataDeCriacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Questionario [codigo=" + codigo + ", nome="
				+ nome + ", dataDeCriacao=" + dataDeCriacao + "]";
	}

}
