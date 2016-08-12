package triangulo;

public class Triangulo {

	public static void main(String[] args) {

		int lado1 = 10;
		int lado2 = 7;
		int lado3 = 8;
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equilatero");
		} else {
			if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Isóceles");
			} else {
				System.out.println("Escaleno");
			}
		}
		
	}

}
