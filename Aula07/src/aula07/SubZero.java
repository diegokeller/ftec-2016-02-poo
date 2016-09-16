package aula07;

public final class SubZero extends Personagem {

	public SubZero(String nome, Integer hp, Integer raioX) {
		super(nome, hp, raioX);
	}

	public void congelar() {
		System.out.println(nome + " congelando.");
	}

	@Override
	public void fatality() {
		System.out.println(nome + " congelando e "
				+ "despedaçando o adversário");
	}

	// Métodos final não podem ser sobrescritos
	// @Override
	// public Integer getHp() {
	// return 1000;
	// }

}
