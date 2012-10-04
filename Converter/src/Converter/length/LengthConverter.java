package converter.length;

import converter.ConversionUnit;

public abstract class LengthConverter implements ConversionUnit {
	protected String fromUnitId;
	protected String toUnitId;
	protected static String hashCode= "";
	
	LengthConverter(){
		fromUnitId = Length.UNKNOWN.getID();
		toUnitId = Length.UNKNOWN.getID();
	}

	@Override
	public String getFromUnitId() {
		// TODO Auto-generated method stub
		return fromUnitId;
	}

	@Override
	public String getToUnitId() {
		// TODO Auto-generated method stub
		return toUnitId;
	}
}
