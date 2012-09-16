package converter.temperature;

public final class CelsiumToKelvin extends TemperatureConverter {

	public CelsiumToKelvin() {
		// TODO Auto-generated constructor stub
		fromUnitId = Temperature.CELSIUM.getIndex();
		toUnitId = Temperature.KELVIN.getIndex();
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData + 273.15;
	}

}
