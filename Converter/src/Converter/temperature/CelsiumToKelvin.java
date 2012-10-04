package converter.temperature;

public final class CelsiumToKelvin extends TemperatureConverter {

	protected static String hashCode = "0t1t";
	
	public CelsiumToKelvin() {
		// TODO Auto-generated constructor stub
		fromUnitId = Temperature.CELSIUM.getID();
		toUnitId = Temperature.KELVIN.getID();
		hashCode = "0t1t";
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData + 273.15;
	}

	public static String getHashCode() {
		// TODO Auto-generated method stub
		return hashCode;
	}
}
