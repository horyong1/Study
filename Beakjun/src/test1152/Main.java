package test1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int cnt = 0;
		String [] a = str.split(" ");
		
		for(int i = 0; i<a.length; i++) {
			cnt++;
		}
		
		if(str.charAt(0)==' ') {
			if(cnt>0) {
				cnt = cnt-1;
			}
		
		}
		System.out.println(cnt);
//		StringTokenizer st = new StringTokenizer(str, " ");
//	
//		System.out.println(st.countTokens());
	}

}
