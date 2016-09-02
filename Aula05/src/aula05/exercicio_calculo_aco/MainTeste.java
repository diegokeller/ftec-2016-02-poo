package aula05.exercicio_calculo_aco;

public class MainTeste {

	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		leitura.lerParametros();

		Calculo c = new Calculo();
		System.out.println(c);
		c.calcular(leitura.getLarguraChapa(),
				leitura.getLarguraDesejada());

		Impressao impressao = new Impressao();
		impressao.imprimir(leitura, c);
	}

}
