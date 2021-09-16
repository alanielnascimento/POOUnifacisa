package p3.exercicio02.exe5;

public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}
}
