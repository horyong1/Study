package atcoder.B_Perfect_String;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		boolean lowerCase = false;	// 소문자
		boolean upperCase = false;	// 대문자
		boolean duplicateTest = false;

		
		for(int i = 0 ; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c >='a' && c <= 'z') {
				lowerCase = true;
			}
			if(c >='A' && c <= 'Z') {
				upperCase = true;
			}
			
			int cnt = 0;
			for(int j = 0; j < str.length(); j++) {
				if(c == str.charAt(j)) {
					cnt++;
				}
				if(cnt > 1) {
					duplicateTest = true;
					break;
				}
			}
			if(duplicateTest) {
				break;
			}

		}
		
		if(duplicateTest) {
			System.out.println("No");
		}else if(lowerCase && upperCase) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
