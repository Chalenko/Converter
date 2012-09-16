package converter.length;

public final class YardToMeter extends LengthConverter {

	public YardToMeter() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Length.YARD.getIndex();
		toUnitId = Length.METER.getIndex();
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData * 0.9144;
	}
}
