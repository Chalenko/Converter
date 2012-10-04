package converter.temperature;

public enum Temperature {
	UNKNOWN("", "Unknown"), CELSIUM("0t", "Celsium"), KELVIN("1t", "Kelvin"), FAHRENHEIT(
			"2t", "Fahrenheit");

	private final String id;
	private final String name;

	Temperature(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static Temperature find(String name) {
		for (Temperature t : Temperature.values()) {
			if (t.getName().equals(name)) {
				return t;
			}
		}
		return UNKNOWN;
	}
}
