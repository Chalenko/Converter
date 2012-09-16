package converter;

public interface ConversionUnit {
	double convert(double inputData);
	int getFromUnitId();
	int getToUnitId();
}
