package aula07;

/**
 * POJO do Personagem
 */
public abstract class Personagem {

	protected String nome;
	protected Integer hp;
	protected Integer raioX;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public final Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getRaioX() {
		return raioX;
	}

	public void setRaioX(Integer raioX) {
		this.raioX = raioX;
	}

	public Personagem(String nome, Integer hp,
			Integer raioX) {
		super();
		this.nome = nome;
		this.hp = hp;
		this.raioX = raioX;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((hp == null) ? 0 : hp.hashCode());
		result = prime * result
				+ ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((raioX == null) ? 0 : raioX.hashCode());
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
		Personagem other = (Personagem) obj;
		if (hp == null) {
			if (other.hp != null)
				return false;
		} else if (!hp.equals(other.hp))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (raioX == null) {
			if (other.raioX != null)
				return false;
		} else if (!raioX.equals(other.raioX))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", hp=" + hp
				+ ", raioX=" + raioX + "]";
	}

	public void atacar() {
		System.out.println(nome + " atacando.");
	}

	public void defender() {
		System.out.println(nome + " defendendo.");
	}

	public void andar() {
		System.out.println(nome + " andando.");
	}

	public void pular() {
		System.out.println(nome + " pulando.");
	}

	// Métodos abstratos não tem corpo / código
	// Serão implementados pelas subclasses
	public abstract void fatality();
}
