package p3.exercicio02.exe4;

public class ConversorTemperatura {

	static double celsiusParaFahrenheit(double c) {
		return 9.0 * c / 5.0 + 32.0;
	}

	static double fahrenheitParaCelsius(double f) throws FahrenheitException {
		if (f < -459.67) {
			throw new FahrenheitException("Menor que zero absoluto");
		}
		return 5.0 * (f - 32.0) / 9.0;
	}

}
