package jogo;

public abstract class VerificaVencedor {

	// Nome do jogador que ganhou
	protected String vencedor;

	// Método genérico que verifica se alguém ganhou
	public abstract boolean temVencedor();

	// Obtém o nome do vencedor
	public String getVencedor() {
		return vencedor;
	}

}
