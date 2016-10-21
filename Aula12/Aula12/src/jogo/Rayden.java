package jogo;

public class Rayden extends Personagem
		implements PodeFicarInvisivel, PodeVoar {

	@Override
	public void voar() {
		System.out.println("Rayden voando.");
	}

	@Override
	public void ficarInvisivel() {
		System.out.println("Rayden ficando invisível.");
	}

	@Override
	public void darFatality() {
		System.out.println("Rayden dando fatality.");
	}

}
