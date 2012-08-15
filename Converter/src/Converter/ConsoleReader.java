package Converter;

import java.util.Scanner;
import java.util.StringTokenizer;

public final class ConsoleReader {
	static Scanner sc = new Scanner(System.in);
	private static String str = "";
	private static String from = "Celsium";
	private static String to = "Kelvin";

	public static String getStr() {
		return str;
	}
	
	public static String getFrom() {
		return from;
	}
	
	public static String getTo() {
		return to;
	}

	public static void decode(){
		str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str," \t\n\r,.");
		from = st.nextToken();
		st.nextToken();
		to = st.nextToken(); 
	}
	
	static int run() {
		Integer code = 3;
		str = sc.nextLine();
		if (str.equals("exit")) {
			code = 0;
		}
		if (str.equals("change")) {
			code = 1;
		}
		if (str.equals("swap")) {
			code = 2;
		}
		return code;
	}
}
