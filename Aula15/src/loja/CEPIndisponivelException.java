package loja;

public class CEPIndisponivelException extends Exception {
	private String cepAlternativo;
	public CEPIndisponivelException(String cepAlternativo) {
		super("O CEP informado não está disponível para entrega.");
		this.cepAlternativo = cepAlternativo;
	}
	public String getCepAlternativo() {
		return cepAlternativo;
	}
}
