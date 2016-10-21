package jogo;

public class MainTesteJogo {

	public static void main(String[] args) {

		Personagem p1 = new Scorpion();
		Personagem p2 = new Rayden();

		if (p1 instanceof PodeFicarInvisivel) {
			System.out.println("Fica invisível...");
			PodeFicarInvisivel personagemInvisivel = // CAST 
					(PodeFicarInvisivel) p1;
			personagemInvisivel.ficarInvisivel();
		}
		if (p2 instanceof PodeVoar) {
			System.out.println("Voando...");
			((PodeVoar) p2).voar(); // CAST
		}

	}

}
