package jogo;

public class Scorpion extends Personagem
		implements PodeFicarInvisivel {

	@Override
	public void darFatality() {
		System.out.println("Scorpion dando fatality.");
	}

	@Override
	public void ficarInvisivel() {
		System.out.println("Scorpion ficando invisível.");
	}

}
