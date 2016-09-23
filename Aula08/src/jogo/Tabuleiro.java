package jogo;

public class Tabuleiro {

	protected VerificaVencedor verificaVencedor;

	public void iniciar() {
		while (!verificaVencedor.temVencedor()) {
			System.out.println("Nova rodada.");
		}
		System.out.println(verificaVencedor.getVencedor());
	}

}
