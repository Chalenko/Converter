package converter.temperature;

public final class FahrenheitToCelsium extends TemperatureConverter {

	public FahrenheitToCelsium() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Temperature.FAHRENHEIT.getIndex();
		toUnitId = Temperature.CELSIUM.getIndex();
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return (inputData - 32) * 5 / 9;
	}
}
