package util;

public class Utilidades {

	public double dividir(double numero1, double numero2) throws DivisaoPorZeroException {
		if (numero2 == 0) {
			throw new DivisaoPorZeroException(
					"Não pode dividir " + numero1 + " por zero.");
		}
		return numero1 / numero2;
	}

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > 100) {
			throw new SaldoInsuficienteException(
					"Não há saldo suficiente para sacar " + valor);
		}
		System.out.println("Saque realizado com sucesso!");
	}

}
