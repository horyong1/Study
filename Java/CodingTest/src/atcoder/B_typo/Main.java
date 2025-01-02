package atcoder.B_typo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		if (S.equals(T)) {
            System.out.println("Yes");
            return;
        }
		
		
		int diff1 = -1; // 첫 번째 다른 인덱스
		int diff2 = -1; // 두 번째 다른 인덱스
		
		 for(int i = 0; i < S.length(); i++) {
	           if(S.charAt(i) != T.charAt(i)) { // 문자가 다른 경우
	               if(diff1 == -1) {
	            	   diff1 = i; // 첫 번째 다른 인덱스 저장
	               }else if(diff2 == -1) {
	            	   diff2 = i; // 두 번째 다른 인덱스 저장
	               }else{
	                    // 세 번째 다른 문자가 발견되면 "No"
	                    System.out.println("No");
	                    return; // 프로그램 종료
	                }
	            }
	        }
		
		if(diff1 != -1 && diff2 != -1 &&
			diff2 == diff1 + 1 &&
			S.charAt(diff1) == T.charAt(diff2) &&
			S.charAt(diff2) == T.charAt(diff1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

}