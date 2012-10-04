package converter.temperature;

public final class KelvinToCelsium extends TemperatureConverter {

	protected static String hashCode = "1t0t";
	
	public KelvinToCelsium() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Temperature.KELVIN.getID();
		toUnitId = Temperature.CELSIUM.getID();
		hashCode = "1t0t";
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData - 273.15;
	}
	
	public static String getHashCode() {
		// TODO Auto-generated method stub
		return hashCode;
	}
}
