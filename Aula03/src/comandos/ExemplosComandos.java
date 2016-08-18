package comandos;

public class ExemplosComandos {

	public static void main(String[] args) {

		// Laço com FOR
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// Laço com While
		int j = 0;
		while(j < 10){
			System.out.println("WHILE " + j);
			j++;
		}
		
		// BREAK - CONTINUE
		int k = 0;
		while(true){
			k++;
			if(k % 2 == 0){
				System.out.println("PAR " + k);
				continue;
			}
			System.out.println(k);
			if(k > 10){
				break;
			}
		}
		
	}

}
