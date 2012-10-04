package converter.length;

public final class KilometerToMeter extends LengthConverter {

	public KilometerToMeter() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Length.KILOMETER.getID();
		toUnitId = Length.METER.getID();
		hashCode = "1l0l";
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData * 1000;
	}

}
