package B_MinimizeOrdering;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		sc.close();
		
		int[] count = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			count[str.charAt(i)-'a']++;
		}

		StringBuilder sb =  new StringBuilder();
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j<count[i]; j++) {
				sb.append((char)(i+'a'));				
			}
		}
		
		System.out.println(sb.toString());
		
		
		
//		char[] c = str.toCharArray();
//
//		Arrays.sort(c);
//		
//		for(char a : c) {
//			System.out.print(a);
//		}
		
	}
}
