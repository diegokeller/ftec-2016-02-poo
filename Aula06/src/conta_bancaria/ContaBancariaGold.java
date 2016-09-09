package conta_bancaria;

public class ContaBancariaGold extends ContaBancaria {

	private Float limite;

	public ContaBancariaGold(String cliente, Integer agencia,
			Integer conta) {
		super(cliente, agencia, conta);
		limite = 500f;
		System.out.println("Criando conta gold.");
	}

	@Override
	public void depositar(Float valor) {
		super.depositar(valor);
		System.out.println("Ligando para o cliente....");
	}

	@Override
	public void sacar(Float valor) {
		System.out.println("Saque conta Gold");
		if (this.getSaldo() + this.limite < valor) {
			System.out.println("saldo insuficiente");
			return;
		}
		this.saldo = this.saldo - valor;
	}

}
