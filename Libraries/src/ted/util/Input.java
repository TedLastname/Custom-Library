package ted.util;

import java.util.Scanner;

public class Input {
	public static String scan(String s) {
		System.out.println(s);
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		return a;
	}
}
