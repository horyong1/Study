package atcoder.B_TripleMetre;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		boolean isCheck = false;
		for(int i = 0; i < 3; i++) {
			boolean math = true;
			for(int j = 0; j < str.length(); j ++) {
				char data = (j + i) % 3 == 0 ? 'o': 'x';
				if(str.charAt(j) != data) {
					math = false;
					break;
				}
			}
			if(math) {
				isCheck = true;
				break;
			}
		}
		
		System.out.println(isCheck ? "Yes":"No");
	}
}
