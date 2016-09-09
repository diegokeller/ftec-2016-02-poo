
package conta_bancaria;

/**
 * POJO de Conta Bancária
 */
public class ContaBancaria extends Object {

	private static final float SALDAO_INICIAL = 0f;
	protected Float saldo;
	private String cliente;
	private Integer agencia;
	private Integer conta;

	// Ao usar "static" e "final" você declara uma constante
	// Por convenção, constantes são escrita em MAIÚSCULO.
	public static final String BANCO = "BANCO ABC";

	public ContaBancaria(String cliente, Integer agencia,
			Integer conta) {
		super();
		System.out.println("Criando conta normal.");
		this.saldo = SALDAO_INICIAL;
		this.cliente = cliente;
		this.agencia = agencia;
		this.conta = conta;
	}

	public Float getSaldo() {
		return saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getConta() {
		return conta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result
				+ ((conta == null) ? 0 : conta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", cliente="
				+ cliente + ", agencia=" + agencia + ", conta="
				+ conta + "]";
	}

	public void sacar(Float valor) {
		System.out.println("Saque conta normal");
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente.");
			return;
		}
		this.saldo = this.saldo - valor;
	}

	public void depositar(Float valor) {
		this.saldo = this.saldo + valor;
	}

}
