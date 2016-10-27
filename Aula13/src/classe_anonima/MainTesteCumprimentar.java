package classe_anonima;

public class MainTesteCumprimentar {
	
	public static void main(String[] args) {
		
		// Forma tradicional, implementando a interface em uma classe
		Cumprimentar c1 = new Abraco();
		c1.cumprimentar("João");

		// Interfaces não podem ser instanciadas
		// Erro de compilação
//		Cumprimentar c2 = new Cumprimentar();
		
		// Usando classe anônima
		Cumprimentar c3 = new Cumprimentar() {
			
			@Override
			public void cumprimentar(String nomePessoa) {
				System.out.println("Acenar para " + nomePessoa);
			}
		};
		
		c3.cumprimentar("João");
		
	}

}
