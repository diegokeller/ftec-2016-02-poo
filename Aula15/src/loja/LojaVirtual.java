package loja;

public class LojaVirtual {

	public void comprar(Integer codigoProduto,
			Integer quantidade, String cepDestino)
			throws EstoqueInsuficienteException,
			CEPIndisponivelException {

		if (codigoProduto == 10 && quantidade > 1) {
			// Não tem mais desse produto em estoque

			// Crio uma instância da exceção
			EstoqueInsuficienteException erroEstoque = new EstoqueInsuficienteException(
					1);

			// Lanço a exceção
			throw erroEstoque;
		}

		if (cepDestino.equals("95000-000")) {
			throw new CEPIndisponivelException("95000-001");
		}

		System.out.println("Compra realizada com sucesso.");

	}

}
