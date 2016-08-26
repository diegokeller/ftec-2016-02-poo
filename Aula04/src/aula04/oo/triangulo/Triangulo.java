package aula04.oo.triangulo;

public class Triangulo {

	// Atributos
	// Informações úteis
	Integer aresta1;
	Integer aresta2;
	Integer aresta3;
	String tipo;

	public void classificar() {
		if (aresta1 == aresta2 && aresta2 == aresta3) {
			tipo = "Equilatero";
		} else {
			if (aresta1 == aresta2 || aresta2 == aresta3
					|| aresta1 == aresta3) {
				tipo = "Isóceles";
			} else {
				tipo = "Escaleno";
			}
		}
	}
}
