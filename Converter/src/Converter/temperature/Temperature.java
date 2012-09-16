package converter.temperature;

public enum Temperature {
	UNKNOWN(-1, "Unknown"), CELSIUM(0, "Celsium"), KELVIN(1, "Kelvin"), FAHRENHEIT(
			2, "Fahrenheit"), RANKINE(3, "Rankine"), DELISLE(4, "Delisle"), NEWTON(
			5, "Newton"), REAMUR(6, "Reamur"), ROMER(7, "Romer");

	private final int index;
	private final String name;

	Temperature(int _index, String _name) {
		this.index = _index;
		this.name = _name;
	}

	public int getIndex() {
		return index;
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
