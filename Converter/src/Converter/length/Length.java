package converter.length;

public enum Length {
	UNKNOWN("", "Unknown"), METER("0l", "Meter"), KILOMETER("1l", "Kilometer"), SANTIMETER("2l", "Santimeter"), YARD("3l", "Yard"), FT("4l", "Ft"), INCH("5l", "Inch"), MILE("6l", "Mile");

	private final String id;
	private final String name;

	Length(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getID() {
		return id;
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
