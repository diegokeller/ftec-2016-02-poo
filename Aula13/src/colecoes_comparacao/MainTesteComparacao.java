package colecoes_comparacao;

import java.util.LinkedList;
import java.util.List;

public class MainTesteComparacao {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new LinkedList<>();
		Pessoa joao = new Pessoa("João", "123");
		Pessoa maria = new Pessoa("Maria", "123");
		Pessoa carlos = new Pessoa("Carlos", "456");
		pessoas.add(joao);
		System.out.println(pessoas.contains(maria));
		System.out.println(pessoas.contains(carlos));
		
	}

}
