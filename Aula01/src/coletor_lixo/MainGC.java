package coletor_lixo;

import java.util.LinkedList;
import java.util.List;

public class MainGC {

	public static void main(String[] args) throws InterruptedException {

		// Lista de valores
		List<String> valores = new LinkedList<String>();
		
		// Contador
		int i = 0;
		
		// Tempo inicial
		long inicio = System.currentTimeMillis();
		
		// Laço infinito
		while(true){
			
			// Adiciona um valor
			valores.add(new String(Long.toString(System.currentTimeMillis())));
			i++;
			
			if(i==1000){
				for (int j = 0; j < 750; j++) {
					valores.remove(0);
				}
				i = 0;
			}
			
			/*
			if(i%25000 == 0){
				System.gc();
				System.out.println(i + " Limpou");
			}
			*/
			if(i%500==0){
				Thread.sleep(1);
			}
			
		}
		/*
		long fim = System.currentTimeMillis();
		System.out.println((fim-inicio));
		*/
	}

}
