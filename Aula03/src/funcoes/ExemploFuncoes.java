package funcoes;

public class ExemploFuncoes {

	private static float somar(float a, float b) {
		return a + b;
	}

	private static float dividir(float a, float b) {
		return a / b;
	}

	public static float media(float a, float b) {
		float soma = somar(a, b);
		float divisao = dividir(soma, 2);
		return divisao;
	}

}
