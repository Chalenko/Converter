package Converter;

import java.util.Scanner;

public final class ConsoleReader {
	static Scanner sc = new Scanner(System.in);
	private static String str = "";

	public static String getStr() {
		return str;
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
