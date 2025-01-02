package atcoder.B_CaesarCipher;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();
		sc.close();
		
		
		int N = S.length();
		
		int shift  = getShift(S.charAt(0), T.charAt(0));
		
		boolean isShift = true;
		for(int i = 1; i < N; i++) {
			if(getShift(S.charAt(i), T.charAt(i)) != shift) {
				isShift = false;
				break;
			}
		}
		System.out.println(isShift ? "Yes":"No");
		
		
	}
	public static int getShift(char s, char t) {
		// 두 문자 차이에 음수 발생시 양수로 변환하기 위해 26 더함
		// 이후 26으로 나눠 나머지 값으로 값을 얻음
		return (t - s + 26) % 26;
	}
}
