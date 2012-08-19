package Converter;

import org.apache.log4j.Logger;

enum Temperature {
	CELSIUM(0, "Celsium"), KELVIN(1, "Kelvin"), FAHRENHEIT(2, "Fahrenheit"), RANKINE(
			3, "Rankine"), DELISLE(4, "Delisle"), NEWTON(5, "Newton"), REAMUR(6,
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
	private Temperature to = Temperature.KELVIN;
	private static Logger LOGINTEMPERATURE = Logger
			.getLogger(TemperatureConverter.class);

	TemperatureConverter() {
	}

	TemperatureConverter(Temperature _from, Temperature _to) {
		this.from = _from;
		this.to = _to;
	}
	
	TemperatureConverter(String _from, String _to) {
		if(_from.equals("Celsium")){
			this.from = Temperature.CELSIUM;
		}
		if(_from.equals("Kelvin")){
			this.from = Temperature.KELVIN;
		}
		if(_from.equals("Fahrenheit")){
			this.from = Temperature.FAHRENHEIT;
		}
		if(_from.equals("Rankine")){
			this.from = Temperature.RANKINE;
		}
		if(_from.equals("Delisle")){
			this.from = Temperature.DELISLE;
		}
		if(_from.equals("Newton")){
			this.from = Temperature.NEWTON;
		}
		if(_from.equals("Reamur")){
			this.from = Temperature.REAMUR;
		}
		if(_from.equals("Romer")){
			this.from = Temperature.ROMER;
		}
		if(_to.equals("Celsium")){
			this.to = Temperature.CELSIUM;
		}
		if(_to.equals("Kelvin")){
			this.to = Temperature.KELVIN;
		}
		if(_to.equals("Fahrenheit")){
			this.to = Temperature.FAHRENHEIT;
		}
		if(_to.equals("Rankine")){
			this.to = Temperature.RANKINE;
		}
		if(_to.equals("Delisle")){
			this.to = Temperature.DELISLE;
		}
		if(_to.equals("Newton")){
			this.to = Temperature.NEWTON;
		}
		if(_to.equals("Reamur")){
			this.to = Temperature.REAMUR;
		}
		if(_to.equals("Romer")){
			this.to = Temperature.ROMER;
		}
	}

	public Temperature getFrom() {
		return from;
	}

	public void setFrom(Temperature _from) {
		this.from = _from;
	}
	
	public void setFrom(String _from) {
		if(_from.equals("Celsium")){
			this.from = Temperature.CELSIUM;
		}
		if(_from.equals("Kelvin")){
			this.from = Temperature.KELVIN;
		}
		if(_from.equals("Fahrenheit")){
			this.from = Temperature.FAHRENHEIT;
		}
		if(_from.equals("Rankine")){
			this.from = Temperature.RANKINE;
		}
		if(_from.equals("Delisle")){
			this.from = Temperature.DELISLE;
		}
		if(_from.equals("Newton")){
			this.from = Temperature.NEWTON;
		}
		if(_from.equals("Reamur")){
			this.from = Temperature.REAMUR;
		}
		if(_from.equals("Romer")){
			this.from = Temperature.ROMER;
		}
	}

	public Temperature getTo() {
		return to;
	}

	public void setTo(Temperature _to) {
		this.to = _to;
	}
	
	public void setTo(String _to) {
		if(_to.equals("Celsium")){
			this.to = Temperature.CELSIUM;
		}
		if(_to.equals("Kelvin")){
			this.to = Temperature.KELVIN;
		}
		if(_to.equals("Fahrenheit")){
			this.to = Temperature.FAHRENHEIT;
		}
		if(_to.equals("Rankine")){
			this.to = Temperature.RANKINE;
		}
		if(_to.equals("Delisle")){
			this.to = Temperature.DELISLE;
		}
		if(_to.equals("Newton")){
			this.to = Temperature.NEWTON;
		}
		if(_to.equals("Reamur")){
			this.to = Temperature.REAMUR;
		}
		if(_to.equals("Romer")){
			this.to = Temperature.ROMER;
		}
	}

	public void swap() {
		Temperature temp = this.from;
		this.from = this.to;
		this.to = temp;
	}
	
	private static double CelsiumToCelsium(final double cels) {
		return cels;
	}

	private static double KelvinToCelsium(final double kelv) {
		return kelv - 273.15;
	}

	private static double FahrenheitToCelsium(final double fahr) {
		return (fahr - 32) * 5 / 9;
	}
	private static double RankineToCelsium(final double rank) {
		return (rank - 491.67) * 5 / 9;
	}
	private static double DelisleToCelsium(final double del) {
		return 100 - del * 2 / 3;
	}
	private static double NewtonToCelsium(final double newt) {
		return newt * 100 / 33;
	}
	private static double ReamurToCelsium(final double ream) {
		return ream * 5 / 4;
	}
	private static double RomerToCelsium(final double rom) {
		return (rom - 7.5) * 40 / 21;
	}

	private static double CelsiumToKelvin(final double cels) {
		return cels + 273.15;
	}

	private static double CelsiumToFahrenheit(final double cels) {
		return cels * 9 / 5 + 32;
	}
	private static double CelsiumToRankine(final double cels) {
		return (cels + 273.15) * 9 / 5;
	}
	private static double CelsiumToDelisle(final double cels) {
		return (100 - cels) * 3 / 2;
	}
	private static double CelsiumToNewton(final double cels) {
		return cels * 33 / 100;
	}
	private static double CelsiumToReamur(final double cels) {
		return cels * 4 / 5;
	}
	private static double CelsiumToRomer(final double cels) {
		return cels * 21 / 40 + 7.5;
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
		case 3:
			result = RankineToCelsium(result);
			break;
		case 4:
			result = DelisleToCelsium(result);
			break;
		case 5:
			result = NewtonToCelsium(result);
			break;
		case 6:
			result = ReamurToCelsium(result);
			break;
		case 7:
			result = RomerToCelsium(result);
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
		case 3:
			result = CelsiumToRankine(result);
			break;
		case 4:
			result = CelsiumToDelisle(result);
			break;
		case 5:
			result = CelsiumToNewton(result);
			break;
		case 6:
			result = CelsiumToReamur(result);
			break;
		case 7:
			result = CelsiumToRomer(result);
			break;
		default:
			break;
		}
		LOGINTEMPERATURE.info("From " + temp + " " + from.getName() + " to "
				+ result + " " + to.getName());
	}
}
