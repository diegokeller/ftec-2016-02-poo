package china;
import calculadora.CalculadoraPadrao;

public class CalculadoraDaChina
		implements CalculadoraPadrao {

	@Override
	public float dividir(float arg0, float arg1) {
		return arg0 / arg1;
	}

	@Override
	public float multiplicar(float arg0, float arg1) {
		return arg0 * arg1;
	}

	@Override
	public float somar(float arg0, float arg1) {
		return arg0 + arg1;
	}

	@Override
	public float subtrair(float arg0, float arg1) {
		return arg0 - arg1;
	}

}
