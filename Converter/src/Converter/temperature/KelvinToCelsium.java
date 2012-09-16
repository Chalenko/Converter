package converter.temperature;

public final class KelvinToCelsium extends TemperatureConverter {

	public KelvinToCelsium() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Temperature.KELVIN.getIndex();
		toUnitId = Temperature.CELSIUM.getIndex();
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData - 273.15;
	}
}
