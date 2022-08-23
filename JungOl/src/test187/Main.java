package test187;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		String str = sc.next();

		while (true) {
			int n = sc.nextInt();

			try {
				c = str.charAt(n - 1);

			} catch (Exception e) {

				c = str.charAt(0);

			}

			str = str.replace(String.valueOf(c), "");
			if (str.length() == 1) {
				System.out.println(str);
				sc.close();
				break;
			} else {
				System.out.println(str);

			}
		}
	}

}
