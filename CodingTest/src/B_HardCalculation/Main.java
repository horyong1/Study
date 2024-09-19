package B_HardCalculation;

import java.util.Scanner;

/**
 * 2개의 값을  A, B 받아서 A+B계산
 * Carry가 포함되면 Hard 포함되지 않으면 Easy
 * A + B 를 계산했을때 더 큰 값 기준으로 Carry 가 있는지 확인 
 * 자리수 계산해서 while 문으로 0채워 넣어줌 이후 Carry 값 체크
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		
		String strA = String.valueOf(A);
		String strB = String.valueOf(B);
		
		
		while(strA.length() > strB.length()) {
			strB = "0" + strB;
		}
		
		while(strA.length() < strB.length()) {
			strA = "0" + strA;
		}
		
		boolean isCarry = false;
		for(int i = 0; i < strA.length(); i++) {
			int tempA = strA.charAt(i) - '0';
			int tempB = strB.charAt(i) - '0';
			
			if( tempA + tempB >=10) {
				isCarry = true;
			}
		}
		
		System.out.println(isCarry ? "Hard" : "Easy");
		
	}
	
}
