package converter.temperature;

public final class CelsiumToCelsium extends TemperatureConverter {
	
	protected static String hashCode = "0t0t";
	
	public CelsiumToCelsium(){
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Temperature.CELSIUM.getID();
		toUnitId = Temperature.CELSIUM.getID();
	}
	
	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData;
	}

	public static String getHashCode() {
		// TODO Auto-generated method stub
		return hashCode;
	}
}