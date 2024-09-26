package atcoder.A_DistinctStrings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
//		2번 문제풀이		
		char c1 = str.charAt(0);
		char c2 = str.charAt(1);
		char c3 = str.charAt(2);
		
		if( c1 == c2 && c2 == c3) {
			System.out.println(1);
			return;
		}
		
		if(c1 == c2 || c2 == c3 || c1 == c3) {
			System.out.println(3);
			return;
		}
		
		System.out.println(6);
		
		
//		1번 문제 풀이 
//		char[] charList = str.toCharArray();
//		int cnt = 0;
//		
//		String[] strList = new String[6];
//		int index = 0;
//		
//		for(int i = 0; i < charList.length; i++) {
//			for(int j = 0; j < charList.length; j++) {
//				for(int k = 0; k < charList.length; k++) {
//					if(i != j && j != k && k != i) {
//						String str2 = "" + charList[i] + charList[j] + charList[k];
//						
//						
//						boolean isUnique = true;
//						for(int m = 0; m <cnt; m++) {
//							if(strList[m].equals(str2)) {
//								isUnique = false;
//								break;
//								
//							}
//						}
//						
//						if(isUnique) {
//							strList[index++] = str2;
//							cnt++;
//						}
//					}
//				}
//				
//			}
//			
//		}
//		System.out.println(cnt);
	}

}
