package calculadora;

// Estamos estabelecendo o "contrato" de como os métodos devem
// ser chamados e os seus parâmetros
public interface CalculadoraPadrao {

	public float somar(float a, float b);

	public float subtrair(float a, float b);

	public float multiplicar(float a, float b);

	public float dividir(float a, float b);

}
