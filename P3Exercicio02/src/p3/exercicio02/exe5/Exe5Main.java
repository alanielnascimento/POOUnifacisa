package p3.exercicio02.exe5;

public class Exe5Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(147, 1010, "Pedro", 2500);
		cc.depositar(2000);
		System.out.println("EXTRATO DEPOIS DO DEPOSITO: R$" + cc.getSaldo());
		try {
			cc.sacar(100);
			System.out.println("EXTRATO DEPOIS DO SAQUE: R$" + cc.getSaldo());
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}

}
