package aula05.exercicio_calculo_aco;

public class Impressao {

	public void imprimir(Leitura leitura, Calculo calculo) {
		System.out.println("Você deve fazer "
				+ calculo.getQuantidadeCortes() + " cortes de "
				+ leitura.getLarguraDesejada() + " cada um.");
		System.out.println(
				"Haverá uma sobra de " + calculo.getSobra());
	}

}
