package aula04.exercicios.insercao_ordenada;

public class InsercaoOrdenada {

	public static void main(String[] args) {

		Integer[] vetor = gerarVetorAleatorio(20);
		for (Integer abacaxi : vetor) {
			System.out.println(abacaxi);
		}

		System.out.println("===============");

		vetor = inserirOrdenado(vetor);
		for (Integer abacaxi : vetor) {
			System.out.println(abacaxi);
		}

		// Integer posicao = acharPosicaoDeInsercao(5, vetor);
		// System.out.println("Inserir na posição: " + posicao);
		//
		// // Cria um vetor de teste
		// Integer[] teste = new Integer[] { 6, 5, 7, 2, null };
		// teste = deslocarValorAPartirDaPosicao(1, teste);
		// for (Integer integer : teste) {
		// System.out.println(integer);
		// }
	}

	public static Integer[] inserirOrdenado(Integer[] vetor) {
		// Declara o vetor ordenado
		Integer[] vetorOrdenado = new Integer[vetor.length];
		// Percorre o vetor
		for (int i = 0; i < vetor.length; i++) {
			// Encontra a posição para inserir
			Integer posicao = acharPosicaoDeInsercao(vetor[i],
					vetorOrdenado);
			// Desloca os valores
			deslocarValorAPartirDaPosicao(posicao, vetorOrdenado);
			// Insere na posição
			vetorOrdenado[posicao] = vetor[i];
		}
		return vetorOrdenado;
	}

	public static Integer[] deslocarValorAPartirDaPosicao(
			Integer posicao, Integer[] vetor) {

		// Percore o vetor
		for (int i = (vetor.length - 1); i > posicao; i--) {
			// Desloca para frente
			vetor[i] = vetor[i - 1];
			vetor[i - 1] = null;
		}
		return vetor;
	}

	public static Integer acharPosicaoDeInsercao(
			Integer numero, Integer[] vetor) {

		// Percorre o vetor
		for (int i = 0; i < vetor.length; i++) {

			// Se estiver vazio insere aqui
			if (vetor[i] == null) {
				return i;
			}

			// Se for menor insere aqui
			if (numero < vetor[i]) {
				return i;
			}
		}

		// Não tem mais espaço
		return -1;
	}

	public static Integer[] gerarVetorAleatorio(
			Integer tamanho) {

		// Declara o vetor
		Integer[] vetor = new Integer[tamanho];

		// Gera os valores
		for (int i = 0; i < vetor.length; i++) {
			Integer valor = (int) (Math.random() * tamanho);
			vetor[i] = valor;
		}

		// Retorna
		return vetor;
	}

}
