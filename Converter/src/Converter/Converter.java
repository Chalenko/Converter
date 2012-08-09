package Converter;

import org.apache.log4j.Logger;

public class Converter {

	/**
	 * @param args
	 */
	public static final Logger LOG=Logger.getLogger(Converter.class);
	public static void main(String[] args) {
	    Frame.Create();
	    Convert(Temperature.CELSIUM, Temperature.KELVIN, -273.15);
	    Convert(Temperature.CELSIUM, Temperature.KELVIN, 0);
	    Convert(Temperature.CELSIUM, Temperature.KELVIN, 100);
	    Convert(Temperature.KELVIN, Temperature.CELSIUM, 0);
	    Convert(Temperature.KELVIN, Temperature.KELVIN, 70);
	    Convert(Temperature.CELSIUM, Temperature.CELSIUM, 30);
	}
    public enum Temperature {
    	CELSIUM(0, "Celsium"), KELVIN(1, "Kelvin"), FAHRENHEIT(2, "Fahrenheit"), RANKIN(3, "Rankin"), DELISLE(4, "Delisle"), NEWTON(5, "Newton"), REAMUR(6, "Reamur"), ROMER(7, "Romer");
    	
    	private final int index;
    	private final String name;
    	Temperature(int _index, String _name){
    		this.index = _index;
    		this.name = _name;
    	}
    }
    private static double KelvinToCelsium(final double kelv){
    	return kelv-273.15;
    }
    private static double CelsiumToKelvin(final double cels){
    	return cels+273.15;
    }
    private static double CelsiumToCelsium(final double cels){
    	return cels;
    }
    public static void Convert(Temperature from, Temperature to, double temp){
    	double result = temp;
    	switch(from.index){
    	case 0:
    		result = CelsiumToCelsium(result);
    		break;
    	case 1:
    		result = KelvinToCelsium(result);
    		break;
		default:
			break;
    	}
    	switch(to.index){
    	case 0:
    		result = CelsiumToCelsium(result);
    		break;
    	case 1:
    		result = CelsiumToKelvin(result);
    		break;
		default:
			break;
    	}
    	LOG.info("From "+temp+" "+from.name+" to "+result+" "+to.name);
    }
}
/*
log4j.rootCategory=INFO, file
log4j.appender.file=org.apache.log4j.FileAppender
log4j.appender.file.Encoding=Cp1251
log4j.appender.file.file = ./logs/test.log
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=%-5p: %d{dd.MM.yyyy HH:mm} %m%n
*/
/*
log4j.rootCategory=DEBUG, console
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%-5p: %d{dd.MM.yyyy HH:mm} %m%n
*/