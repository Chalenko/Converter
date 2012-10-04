package converter.length;

public final class YardToMeter extends LengthConverter {

	public YardToMeter() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Length.YARD.getID();
		toUnitId = Length.METER.getID();
		hashCode = "3l0l";
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData * 0.9144;
	}
}
