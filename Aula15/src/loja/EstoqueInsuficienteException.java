package loja;

public class EstoqueInsuficienteException
		extends Exception {

	private Integer quantidadeEmEstoque;

	public EstoqueInsuficienteException(
			Integer quantidadeEmEstoque) {
		super("Estoque indisponível para esse produto.");
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public Integer getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}

}
