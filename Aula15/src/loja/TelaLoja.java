package loja;

import javax.swing.JOptionPane;

public class TelaLoja {

	private CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	public void comprar() {
		try {
			carrinho.finalizarCompra("95000-000");
		} catch (EstoqueInsuficienteException e) {
			JOptionPane.showMessageDialog(null,
					e.getMessage() + " | Ainda tem "
							+ e.getQuantidadeEmEstoque()
							+ " itens em estoque.");
		} catch (CEPIndisponivelException e) {
			JOptionPane.showMessageDialog(null,
					e.getMessage() + " | Você gostaria de receber no CEP "
							+ e.getCepAlternativo() + "?");
		}
	}

}
