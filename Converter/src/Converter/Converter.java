package converter;

import java.util.HashSet;

import org.apache.log4j.Logger;

import converter.temperature.CelsiumToCelsium;
import converter.temperature.KelvinToCelsium;

public class Converter{

	/**
	 * @param args
	 */
	private static HashSet<ConversionUnit> convUnits = new HashSet<ConversionUnit>();
	public static final Logger LOGINCONVERTER = Logger
			.getLogger(Converter.class);

	public static void main(String[] args) {
		LOGINCONVERTER.info("Converter started succes");
		convUnits.add(new KelvinToCelsium());
		ConversionUnit conv1 = new KelvinToCelsium();
		ConversionUnit conv2 = new CelsiumToCelsium();
		System.out.println(conv2.convert(conv1.convert(0)));
		//Frame.CreateTemperatureFrame(conv);
		/*
		 * cels2kel.Convert(-273.15); cels2kel.Convert(0);
		 * cels2kel.Convert(100); new TemperatureConverter(Temperature.KELVIN,
		 * Temperature.CELSIUM).Convert(0); new
		 * TemperatureConverter(Temperature.KELVIN,
		 * Temperature.KELVIN).Convert(70); new
		 * TemperatureConverter().Convert(30);
		 */
		/*
		while (true) {
			switch (ConsoleReader.run()) {
			case 0:
				System.exit(0);
				break;
			case 1:
				ConsoleReader.decode();
				conv.setFrom(ConsoleReader.getFrom());
				conv.setTo(ConsoleReader.getTo());
				break;
			case 2:
				conv.swap();
				break;
			case 3:
				conv.Convert(Double.parseDouble(ConsoleReader.getStr()));
				break;
			default:
				break;
			}
		}
		*/
	}
	
	public double convert(double inputData, int fromUnitId, int toUnitId){
		return 0;
	}
	
	public void addUnits(final ConversionUnit unit){
		convUnits.add(unit);
	}
}