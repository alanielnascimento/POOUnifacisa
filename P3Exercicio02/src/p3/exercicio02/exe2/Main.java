package p3.exercicio02.exe2;

import p3.exercicio02.exe1.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 100, "João", 2500);
		try {
			cc.depositar(2000);
			System.out.println("EXTRATO DEPOIS DO DEPOSITO: R$" + cc.getSaldo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			cc.sacar(100);
			System.out.println("EXTRATO DEPOIS DO SAQUE: R$" + cc.getSaldo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
