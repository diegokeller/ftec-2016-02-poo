package loja;

public class CarrinhoDeCompras {
	
	LojaVirtual lojaVirtual = new LojaVirtual();
	
	public void finalizarCompra(String cep) throws EstoqueInsuficienteException, CEPIndisponivelException{
		lojaVirtual.comprar(10, 5, cep);
		lojaVirtual.comprar(12, 2, cep);
	}

}
