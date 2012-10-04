package converter.temperature;

public final class FahrenheitToCelsium extends TemperatureConverter {

	protected static String hashCode = "2t0t";
	
	public FahrenheitToCelsium() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Temperature.FAHRENHEIT.getID();
		toUnitId = Temperature.CELSIUM.getID();
		hashCode = "2t0t";
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return (inputData - 32) * 5 / 9;
	}
	
	public static String getHashCode() {
		// TODO Auto-generated method stub
		return hashCode;
	}
}
