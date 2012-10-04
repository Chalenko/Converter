package converter.temperature;

import converter.ConversionUnit;

public abstract class TemperatureConverter implements ConversionUnit {

	protected String fromUnitId;
	protected String toUnitId;
	
	TemperatureConverter(){
		fromUnitId = Temperature.UNKNOWN.getID();
		toUnitId = Temperature.UNKNOWN.getID();
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
