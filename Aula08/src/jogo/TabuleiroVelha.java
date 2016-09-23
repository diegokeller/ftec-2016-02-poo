package jogo;

public class TabuleiroVelha
		extends Tabuleiro {

	public TabuleiroVelha() {
		this.verificaVencedor = new VerificaVencedor3emLinha();
	}

}
