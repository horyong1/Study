package test604;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		int cnt=0;
		for (int i = 0; i < 10; i++) {
			str[i] = sc.next();
			cnt++;
			if(str[i].length()==1) {
				sc.close();
				break;
				
			}
		}
		String s = str[cnt-1];

		
		for (int i = 0; i < cnt-1; i++) {
			char s2 = str[i].charAt(str[i].length()-1);
			if (s.charAt(0)==s2) {
					System.out.println(str[i]);
				}
			
		}

	}

}
