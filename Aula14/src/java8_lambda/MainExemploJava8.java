package java8_lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainExemploJava8 {

	public static void main(String[] args) {
		
		List<String> cidades = new LinkedList<String>();
		cidades.add("Caxias do Sul");
		cidades.add("Farroupilha");
		cidades.add("Bento Gonçalves");
		cidades.add("São Bento do Sul");
		cidades.add("São Francisco de Paula");
		
		// Filtrar elementos de uma lista
		cidades.stream()
			.filter(cidade -> {
				return cidade.contains("Sul");
			})
			.forEach(cidade -> {
				System.out.println(cidade);
			});
		
		Long cidadeComSao = cidades
				.stream()
				.filter(cidade -> {
					return cidade.contains("São");
				})
				.count();
		System.out.println(cidadeComSao);
		
		cidades.stream().filter(cidade -> {
			return cidade.contains("a");
		})
		.limit(3)
		.sorted()
		.forEach(System.out::println);
		
		Map<Integer, List<String>> coleta = cidades
			.stream()
			.collect(Collectors.groupingBy(cidade -> {
				return cidade.length();
			}));
		System.out.println(coleta);
		
	}
	
}

