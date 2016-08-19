package juro_composto;

public class Principal {

	public static void main(String[] args) {
		float valorFinanciado = LeituraDados
				.lerValorFinanciado();
		float taxa = LeituraDados.lerTaxa();
		float prazo = LeituraDados.lerPrazo();
		double valorFinal = CalculaJuroComposto
				.calcular(valorFinanciado, taxa, prazo);
		System.out.println("Valor final: " + valorFinal);
	}

}
