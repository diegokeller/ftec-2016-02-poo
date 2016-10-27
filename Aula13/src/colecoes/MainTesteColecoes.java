package colecoes;

import java.util.ArrayList;
import java.util.List;

public class MainTesteColecoes {
	
	public static void main(String[] args) {
		
		// Declarando uma variável de lista.
		// O parâmetro entre os sinais de "<>" é o tipo
		// dos objetos que serão salvos na lista.
		// Uma lista só pode armazenar elementos de um tipo
		// Se é uma hierarquia de classes, pode ser usado o tipo
		// mais genérico.
		// Declare o objeto sempre do tipo "List" interface.
		List<String> nomes = new ArrayList<String>();
		List<Object> qqCoisa = new ArrayList<Object>();
		
		// Adicionar elemento no final
		nomes.add("João");
		
		// Adicionar elemento em uma posição específica
		nomes.add(0, "Maria");
		
		// Remover um elemento específico
		nomes.remove("João");
		
		// Remover um elemento de uma posição
		nomes.remove(0);
		
		// Limpar todos os elementos da lista
		nomes.clear();
		
		// Pegar um elemento pelo índice
		nomes.add("Maria");
		nomes.add("Carla");
		System.out.println(nomes.get(0));
		
		// Testar se a lista contém um elemento
		System.out.println(nomes.contains("Carla"));
		
		// Contar quantos elementos a lista tem
		System.out.println(nomes.size());
		
		// Percorrer a lista
		for (String item : nomes) {
			System.out.println(item);
		}
		
		// Percorrer a lista - Java 8 Lambda Expressions
		nomes.forEach(abacaxi -> {
			System.out.println(abacaxi);
		});
		
	}

}
