package colecoes_ordenacao;

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
		
	}

}
