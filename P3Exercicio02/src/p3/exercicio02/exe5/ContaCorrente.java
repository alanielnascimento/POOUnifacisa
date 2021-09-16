package p3.exercicio02.exe5;

public final class ContaCorrente {

	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	private double limiteSaque;

	public ContaCorrente(int agencia, int conta, String titular, double limiteSaque) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.limiteSaque = limiteSaque;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		} else
			throw new IllegalArgumentException("Você não pode depositar um valor negativo!");
	}

	public void sacar(double valor) throws SaldoInsuficienteException {

		if (valor < 0 || valor > saldo) {
			throw new SaldoInsuficienteException(valor);
		} else {
			saldo -= valor;
		}

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getSaldo() {
		return saldo;
	}

}
