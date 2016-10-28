package colecoes_ordenacao;

import java.util.Comparator;

import colecoes_comparacao.Pessoa;

public class ComparadorPorCpf implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getCpf().compareTo(o2.getCpf());
	}

}
