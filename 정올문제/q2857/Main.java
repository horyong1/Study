package test2857;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []s=new String[5];
		int len =0;
		//배열 입력 값 받기
		for(int i = 0;i<s.length; i++) {
			s[i] = sc.next();
			if(s[i].length()>len) {
				len=s[i].length();
			}
		}
		sc.close();
		
		for(int i =0; i<len; i++) {
			for(int j=0; j<5; j++) {
//				if(s[j].charAt(i)=='\0') {
//					continue;
//				}
				System.out.print(s[j].charAt(i));
			}
		}
	}

}
