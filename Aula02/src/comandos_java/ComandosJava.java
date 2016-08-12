package comandos_java;

public class ComandosJava {

	public static void main(String[] args) {

		// Comentários de uma linha com "//"
		
		/* 
		 Comentários de 
		 mais linhas
		*/
		
		// Declaração de variável
		// tipo nomeDaVariavel;
		int idade;
		int numero = 10;
		
		// Vetores
		int[] idades = new int[10]; // 10 posições
		idades[5] = 25; // definir o valor de uma posição
		int[] numeros = {10,20,30,31}; // valores, 4 posições
		
		// Matrizes
		// 2 dimensões
		// 10 posições cada
		int[][] matriz = new int[10][10]; 

		// Comando IF
		if(numero == 0){
			int preco = 10;
			System.out.println("Valor é zero");
		} else {
			System.out.println("Valor NÃO é zero");
		}
		
		// Tipos do Java
		double preco = 456.78;
		float valor = 123.45f;
		
		// Conversão implícita
		// Variável float cabe dentro de variável double
		// O contrário não funciona, não compila
		preco = valor;
		
		// Tipos primitivos
		char p0 = 'A';
		int p1 = 10;
		float p2 = 10f;
		double p3 = 15;
		boolean p4 = true;
		// p1 = null; // Não compila, tipo primtivo não pode ser null
		
		// Tipos objeto
		Character o0 = 'A';
		Integer o1 = 10;
		Float o2 = 10f;
		Double o3 = 15d;
		Boolean o5 = true;
		o1 = null;
		
	}

}
