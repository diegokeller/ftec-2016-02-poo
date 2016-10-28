package colecoes_ordenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import colecoes_comparacao.Pessoa;

public class MainTesteOrdenacao {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new LinkedList<>();
		Pessoa maria = new Pessoa("Maria", "789");
		Pessoa carlos = new Pessoa("Carlos", "456");
		Pessoa joao = new Pessoa("João", "123");
		pessoas.add(maria);
		pessoas.add(carlos);
		pessoas.add(joao);
		
		// Ordenando uma lista usando Collections
//		System.out.println(pessoas);
//		Collections.sort(pessoas);
//		System.out.println(pessoas);
		
		// Comparando usando uma classe separada
//		System.out.println(pessoas);
//		Collections.sort(pessoas, new ComparadorPorCpf());
//		System.out.println(pessoas);
		
		// Ordena usando classe anônima
		System.out.println(pessoas);
		Collections.sort(pessoas, new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getCpf().compareTo(o2.getCpf());
			}
		});
		System.out.println(pessoas);
		
		// The hypster way - Java 8
		pessoas.sort((a, b) -> {
			return a.getNome().compareTo(b.getNome());
		});
		System.out.println(pessoas);
	}

}
