package converter;

import java.util.Scanner;
import java.util.StringTokenizer;

import converter.temperature.Temperature;
import converter.length.Length;

public final class ConsoleReader {
	static Scanner sc = new Scanner(System.in);
	private static double data = 0;
	private static String str = "";
	private static String from = "Unknown";
	private static String to = "Unknown";
	private static String hashCode = "";

	public static double getData() {
		return data;
	}
	
	public static String getStr() {
		return str;
	}

	public static String getFrom() {
		return from;
	}

	public static String getTo() {
		return to;
	}
	
	public static String getHashCode() {
		return hashCode;
	}

	public static void decode() {
		StringTokenizer st = new StringTokenizer(str, " \t\n\r,.");
		data = Double.valueOf(st.nextToken());
		from = st.nextToken();
		st.nextToken();
		to = st.nextToken();
		createHash();
	}
	
	public static void createHash() {
		hashCode = hashCode.concat(Temperature.find(from).getID());
		hashCode = hashCode.concat(Length.find(from).getID());
		hashCode = hashCode.concat(Temperature.find(to).getID());
		hashCode = hashCode.concat(Length.find(to).getID());
	}

	static int run() {
		int code = 1;
		str = sc.nextLine();
		if (str.equals("exit")) {
			code = 0;
		}
		return code;
	}
}
