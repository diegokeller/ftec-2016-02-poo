package jogo;

public class TabuleiroDamasXadres
		extends Tabuleiro {

	public TabuleiroDamasXadres() {
		this.verificaVencedor = new VerificaVencedorContandoPecas();
	}

}
