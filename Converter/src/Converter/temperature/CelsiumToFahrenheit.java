package converter.temperature;

public final class CelsiumToFahrenheit extends TemperatureConverter {

	protected static String hashCode = "0t2t";
	
	public CelsiumToFahrenheit() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Temperature.CELSIUM.getID();
		toUnitId = Temperature.FAHRENHEIT.getID();
		hashCode = "0t2t";
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData * 9 / 5 + 32;
	}

	public static String getHashCode() {
		// TODO Auto-generated method stub
		return hashCode;
	}
}
