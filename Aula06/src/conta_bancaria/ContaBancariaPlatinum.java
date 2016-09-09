package conta_bancaria;

public class ContaBancariaPlatinum
		extends ContaBancariaGold {

	public ContaBancariaPlatinum(String cliente,
			Integer agencia, Integer conta) {
		super(cliente, agencia, conta);
		System.out.println("Criando conta platinum.");
	}

	public void solicitarCheque(String endereco) {
		System.out.println(
				"Solicitando cheques para o endereço: " + endereco);
	}

}
