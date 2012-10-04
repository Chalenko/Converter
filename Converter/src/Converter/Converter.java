package converter;

import java.util.HashMap;

import org.apache.log4j.Logger;

import converter.temperature.*;

public class Converter{

	/**
	 * @param args
	 */
	private static HashMap<String, ConversionUnit> convUnits = new HashMap<String, ConversionUnit>();
	private static Logger LOGINCONVERTER = Logger.getLogger(Converter.class);

	public static void main(String[] args) {
		init();
		while (true) {
			switch (ConsoleReader.run()) {
			case 0:
				System.exit(0);
				break;
			case 1:
				ConsoleReader.decode();
				//conv.setFrom(ConsoleReader.getFrom());
				//conv.setTo(ConsoleReader.getTo());
				double result = convUnits.get(ConsoleReader.getHashCode()).convert(ConsoleReader.getData());
				System.out.println(result);
				break;
			default:
				break;
			}
		}
	}
	
	public double convert(double inputData, int fromUnitId, int toUnitId){
		return 0;
	}
	
	public static void init(){
		LOGINCONVERTER.info("Converter started succes");
		convUnits.put(CelsiumToCelsium.getHashCode(), new CelsiumToCelsium());
		convUnits.put(CelsiumToFahrenheit.getHashCode(), new CelsiumToFahrenheit());
		convUnits.put(CelsiumToKelvin.getHashCode(), new CelsiumToKelvin());
		convUnits.put(FahrenheitToCelsium.getHashCode(), new FahrenheitToCelsium());
		convUnits.put(KelvinToCelsium.getHashCode(), new KelvinToCelsium());
	}
	
	/*
	public void addUnits(final ConversionUnit unit){
		//convUnits.add(unit);
	}
	*/
}