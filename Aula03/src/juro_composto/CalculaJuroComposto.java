package juro_composto;

public class CalculaJuroComposto {

	public static double calcular(float valor,
			float taxa, float prazo) {
		return valor * Math.pow(1 + taxa, prazo);
	}

}
