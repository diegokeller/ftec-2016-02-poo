package aula05.exercicio_calculo_aco;

public class Calculo {

	private Integer quantidadeCortes;
	private Integer sobra;

	public Integer getQuantidadeCortes() {
		return quantidadeCortes;
	}

	public Integer getSobra() {
		return sobra;
	}

	public void calcular(Integer larguraChapa,
			Integer larguraDesejada) {

		// Divisão da largura da chapa pela largura desejada
		// Exemplo 120 / 50 = 2 (inteiro)
		quantidadeCortes = larguraChapa / larguraDesejada;

		// Resto da divisão
		// Exemplo: 120 / 50 = 20 (resto)
		sobra = larguraChapa % larguraDesejada;

	}

	@Override
	public String toString() {
		return "Calculo [quantidadeCortes=" + quantidadeCortes
				+ ", sobra=" + sobra + "]";
	}

}
