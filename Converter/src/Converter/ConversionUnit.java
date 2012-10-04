package converter;

public interface ConversionUnit {
	double convert(double inputData);
	String getFromUnitId();
	String getToUnitId();
}
