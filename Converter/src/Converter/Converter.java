package Converter;

import org.apache.log4j.Logger;
import Converter.TemperatureConverter;
import Converter.ConsoleReader;

public class Converter {

	/**
	 * @param args
	 */
	public static final Logger LOGINCONVERTER = Logger
			.getLogger(Converter.class);

	public static void main(String[] args) {
		LOGINCONVERTER.info("Converter started succes");
		TemperatureConverter conv = new TemperatureConverter();
		conv.setFrom(Temperature.CELSIUM);
		conv.setTo(Temperature.KELVIN);
		/*
		 * Frame.Create(); cels2kel.Convert(-273.15); cels2kel.Convert(0);
		 * cels2kel.Convert(100); new TemperatureConverter(Temperature.KELVIN,
		 * Temperature.CELSIUM).Convert(0); new
		 * TemperatureConverter(Temperature.KELVIN,
		 * Temperature.KELVIN).Convert(70); new
		 * TemperatureConverter().Convert(30);
		 */
		while (true) {
			switch (ConsoleReader.run()) {
			case 0:
				System.exit(0);
				break;
			case 1:
				ConsoleReader.decode();
				if(ConsoleReader.getFrom().equals("Celsium")){
					conv.setFrom(Temperature.CELSIUM);
				}
				if(ConsoleReader.getFrom().equals("Kelvin")){
					conv.setFrom(Temperature.KELVIN);
				}
				if(ConsoleReader.getFrom().equals("Fahrenheit")){
					conv.setFrom(Temperature.FAHRENHEIT);
				}
				if(ConsoleReader.getTo().equals("Celsium")){
					conv.setTo(Temperature.CELSIUM);
				}
				if(ConsoleReader.getTo().equals("Kelvin")){
					conv.setTo(Temperature.KELVIN);
				}
				if(ConsoleReader.getTo().equals("Fahrenheit")){
					conv.setTo(Temperature.FAHRENHEIT);
				}
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
	}
}