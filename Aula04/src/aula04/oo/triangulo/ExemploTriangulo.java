package aula04.oo.triangulo;

public class ExemploTriangulo {

	public static void main(String[] args) {

		// Cria um novo triângulo
		// Um objeto "real"
		Triangulo maior = new Triangulo();
		maior.aresta1 = 10;
		maior.aresta2 = 10;
		maior.aresta3 = 7;
		maior.classificar();
		System.out.println(maior.tipo);

		Triangulo menor = new Triangulo();
		menor.aresta1 = 2;
		menor.aresta2 = 3;
		menor.aresta3 = 5;
		menor.classificar();
		System.out.println(menor.tipo);
	}

}
