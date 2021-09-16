package p3.exercicio02.exe4;

import java.util.Scanner;

public class TesteTemperatura {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double Celsius, Fahrenheit; // Consegui colocar o nome de variável mais difícil do mundo! o/

		System.out.println("Conversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n"); // Pronto, bem mais
																								// simples!

		System.out.print("Digite a temperatura em Fahrenheit: ");
		Fahrenheit = teclado.nextDouble();

		try {
			Celsius = ConversorTemperatura.fahrenheitParaCelsius(Fahrenheit);
			System.out.print("\nA medida convertida é " + Celsius + "ºC\n");
		} catch (FahrenheitException e) {
			e.printStackTrace();
		} finally {
			teclado.close();
		}

	}

}
