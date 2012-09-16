package converter.length;

public final class MeterToMeter extends LengthConverter {
	
	public MeterToMeter(){
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Length.METER.getIndex();
		toUnitId = Length.METER.getIndex();
	}
	
	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData;
	}
}
