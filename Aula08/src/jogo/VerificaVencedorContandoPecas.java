package jogo;

public class VerificaVencedorContandoPecas
		extends VerificaVencedor {

	@Override
	public boolean temVencedor() {
		System.out.println("Verificando se tem peças"
				+ " apenas de um jogador");
		this.vencedor = "João";
		return true;
	}

}
