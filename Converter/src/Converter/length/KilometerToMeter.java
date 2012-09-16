package converter.length;

public final class KilometerToMeter extends LengthConverter {

	public KilometerToMeter() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Length.KILOMETER.getIndex();
		toUnitId = Length.METER.getIndex();
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData * 1000;
	}
}
