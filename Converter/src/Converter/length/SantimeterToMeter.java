package converter.length;

public final class SantimeterToMeter extends LengthConverter {

	public SantimeterToMeter() {
		// TODO Auto-generated constructor stub
		super();
		fromUnitId = Length.SANTIMETER.getID();
		toUnitId = Length.METER.getID();
		hashCode = "2l0l";
	}

	@Override
	public double convert(double inputData) {
		// TODO Auto-generated method stub
		return inputData/100;
	}

}
