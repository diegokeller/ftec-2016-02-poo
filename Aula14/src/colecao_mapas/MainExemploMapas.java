package colecao_mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExemploMapas {

	public static void main(String[] args) {

		// Declaração de um mapa
		// Definimos o tipo da chave e o tipo do valor
		// A chave é uma String, a UF do estado
		// O valor será um float, valor das vendas
		Map<String, Float> vendasPorEstado = 
				new HashMap<String, Float>();
		
		// Adicionando elementos
		vendasPorEstado.put("RS", 125f);
		vendasPorEstado.put("SC", 250f);
		vendasPorEstado.put("PR", 100f);
		
		// Pegando um elemento pela chave
		Float vendasSC = vendasPorEstado.get("SC");
		System.out.println(vendasSC);
		
		// Testando se um mapa contém uma chave
		System.out.println(vendasPorEstado.containsKey("RJ"));
		
		// Tamanho do mapa, quantidade de entradas
		System.out.println(vendasPorEstado.size());
		
		// Testando se está vazio
		System.out.println(vendasPorEstado.isEmpty());
		
		// Removendo um elemento pela chave
		vendasPorEstado.remove("PR");
		System.out.println(vendasPorEstado);
		
		// Percorrendo as entradas de um mapa
		Set<Entry<String, Float>> entradas = 
				vendasPorEstado.entrySet();
		for (Entry<String, Float> entrada : entradas) {
			System.out.println("CHAVE: " + entrada.getKey());
			System.out.println("VALOR: " + entrada.getValue());
		}
		System.out.println("---------------");
		// Percorre as entradas usando Java 8
		vendasPorEstado.forEach((chave, valor) -> {
			System.out.println("CHAVE: " + chave);
			System.out.println("VALOR: " + valor);
		});

	}

}
