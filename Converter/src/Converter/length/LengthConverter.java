package converter.length;

import converter.ConversionUnit;

public abstract class LengthConverter implements ConversionUnit {
	protected int fromUnitId;
	protected int toUnitId;
	
	LengthConverter(){
		fromUnitId = Length.UNKNOWN.getIndex();
		toUnitId = Length.UNKNOWN.getIndex();
	}

	@Override
	public int getFromUnitId() {
		// TODO Auto-generated method stub
		return fromUnitId;
	}

	@Override
	public int getToUnitId() {
		// TODO Auto-generated method stub
		return toUnitId;
	}
}
