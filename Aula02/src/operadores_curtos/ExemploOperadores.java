package operadores_curtos;

public class ExemploOperadores {

	public static void main(String[] args) {

		int idade = 10;
		
		// Incremento e decremento
		idade++;
		idade--;
		
		// Aritiméticos curtos
		idade += 5; // idade = idade + 5;
		System.out.println(idade);
		idade *= 2; // idade = idade * 2;
		System.out.println(idade);
		
		// Ternário
		// Da série "Conheça mais não use"
		System.out.println(idade > 18 ? "Maior" : "Menor");
		
		int a = 5;
		int b = 5;
		int c = 5;
		
	}

}
