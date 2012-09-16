package converter.temperature;

public final class CelsiumToCelsium extends TemperatureConverter {
	
	public CelsiumToCelsium(){
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Temperature.CELSIUM.getIndex();
		toUnitId = Temperature.CELSIUM.getIndex();
	}
	
	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData;
	}
}