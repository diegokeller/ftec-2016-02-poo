package loja;

public class LojaVirtual {

	public void comprar(Integer codigoProduto,
			Integer quantidade, String cepDestino) {

		if (codigoProduto == 10 && quantidade > 1) {
			// Não tem mais desse produto em estoque
		}
		
		if (cepDestino.equals("95000-000")){
			// Não fazemos entregas para esse CEP
		}

		System.out.println("Compra realizada com sucesso.");

	}

}
