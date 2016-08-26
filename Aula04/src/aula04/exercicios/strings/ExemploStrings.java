package aula04.exercicios.strings;

import java.util.HashMap;
import java.util.Map;

public class ExemploStrings {

	public static void main(String[] args) {

		String nome = "João da Silva";
		System.out.println("Letras: " + nome.length());

		String[] palavras = nome.split(" ");
		System.out.println("Palavras: " + palavras.length);

		String text = "I like good mules. Mules are good :)";
		String[] words = text.split("([\\W\\s]+)");
		Map<String, Integer> counts = new HashMap<String, Integer>();
		for (String word : words) {
			if (counts.containsKey(word)) {
				counts.put(word, counts.get(word) + 1);
			} else {
				counts.put(word, 1);
			}
		}
		System.out.println(counts);
		System.out
				.println("Total de palavras: " + words.length);
	}

}
