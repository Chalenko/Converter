package Converter;

import org.apache.log4j.Logger;

enum Temperature {
	CELSIUM(0, "Celsium"), KELVIN(1, "Kelvin"), FAHRENHEIT(2, "Fahrenheit"), RANKIN(
			3, "Rankin"), DELISLE(4, "Delisle"), NEWTON(5, "Newton"), REAMUR(6,
			"Reamur"), ROMER(7, "Romer");

	private final int index;
	private final String name;

	Temperature(int _index, String _name) {
		this.index = _index;
		this.name = _name;
	}

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}
}

public class TemperatureConverter {
	private Temperature from = Temperature.CELSIUM;
	private Temperature to = Temperature.CELSIUM;
	private static Logger LOGINTEMPERATURE = Logger
			.getLogger(TemperatureConverter.class);

	TemperatureConverter() {
	}

	TemperatureConverter(Temperature _from, Temperature _to) {
		this.from = _from;
		this.to = _to;
	}

	public Temperature getFrom() {
		return from;
	}

	public void setFrom(Temperature _from) {
		this.from = _from;
	}

	public Temperature getTo() {
		return to;
	}

	public void setTo(Temperature _to) {
		this.to = _to;
	}

	public void swap() {
		Temperature temp = this.from;
		this.from = this.to;
		this.to = temp;
	}

	private static double KelvinToCelsium(final double kelv) {
		return kelv - 273.15;
	}

	private static double CelsiumToKelvin(final double cels) {
		return cels + 273.15;
	}

	private static double FahrenheitToCelsium(final double fahr) {
		return (fahr - 32) * 5 / 9;
	}

	private static double CelsiumToFahrenheit(final double cels) {
		return (cels * (9 / 5)) + 32;
	}

	private static double CelsiumToCelsium(final double cels) {
		return cels;
	}

	public void Convert(double temp) {
		double result = temp;
		switch (from.getIndex()) {
		case 0:
			result = CelsiumToCelsium(result);
			break;
		case 1:
			result = KelvinToCelsium(result);
			break;
		case 2:
			result = FahrenheitToCelsium(result);
			break;
		default:
			break;
		}
		switch (to.getIndex()) {
		case 0:
			result = CelsiumToCelsium(result);
			break;
		case 1:
			result = CelsiumToKelvin(result);
			break;
		case 2:
			result = CelsiumToFahrenheit(result);
			break;
		default:
			break;
		}
		LOGINTEMPERATURE.info("From " + temp + " " + from.getName() + " to "
				+ result + " " + to.getName());
	}
}
