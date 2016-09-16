package aula07;

public class Rayden extends Personagem {

	public Rayden(String nome, Integer hp, Integer raioX) {
		super(nome, hp, raioX);
	}

	@Override
	public void fatality() {
		System.out.println(
				nome + " explodindo adversário com raios. ");
	}

}
