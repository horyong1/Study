package Perfect_String;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int lowerCase = 0;	// 소문자
		int upperCase = 0;	// 대문자
		int charEquals = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) >='a' && str.charAt(i) <= 'z') {
				lowerCase ++;
			}
			if(str.charAt(i) >='A' && str.charAt(i) <= 'Z') {
				upperCase ++;
			}
		}
		
		int num = 0;
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					charEquals++;
				}
				if(charEquals > 2) {
					break;
				}
			}
			if(charEquals > 2) {
				num = 1;
				break;
			}
			charEquals = 0;
		}
		
		if(lowerCase > 0 && upperCase > 0 && num == 0 ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
