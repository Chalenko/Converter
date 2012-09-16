package converter.temperature;

import converter.ConversionUnit;

public abstract class TemperatureConverter implements ConversionUnit {

	protected int fromUnitId;
	protected int toUnitId;
	
	TemperatureConverter(){
		fromUnitId = Temperature.UNKNOWN.getIndex();
		toUnitId = Temperature.UNKNOWN.getIndex();
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
