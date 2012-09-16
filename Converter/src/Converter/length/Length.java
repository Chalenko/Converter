package converter.length;

public enum Length {
	UNKNOWN(-1, "Unknown"), METER(0, "Meter"), KILOMETER(1, "Kilometer"), SANTIMETER(
			2, "Santimeter"), YARD(3, "Yard"), FT(4, "Ft"), INCH(
			5, "Inch"), MILE(6, "Mile");

	private final int index;
	private final String name;

	Length(int _index, String _name) {
		this.index = _index;
		this.name = _name;
	}

	public int getIndex() {
		return index;
	}

	public String getName() {
		return name;
	}

	public static Length find(String name) {
		for (Length t : Length.values()) {
			if (t.getName().equals(name)) {
				return t;
			}
		}
		return UNKNOWN;
	}
}
