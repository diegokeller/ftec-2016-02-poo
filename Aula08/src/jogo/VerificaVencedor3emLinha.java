package jogo;

public class VerificaVencedor3emLinha
		extends VerificaVencedor {

	@Override
	public boolean temVencedor() {
		System.out.println(
				"Verificando se tem 3 peças iguais em linha");
		this.vencedor = "Maria";
		return true;
	}

}
