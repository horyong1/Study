package test2604;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String s = sc.next();
		sc.close();
		
		if(s.charAt(0)=='(') {
			sum=10;
			for(int i = 0, k = 1; i<s.length()-1; k++,i++) {
				if(s.charAt(i)==s.charAt(k)) {
					sum+=5;
				}else {
					sum+=10;
				}
			}
			System.out.println(sum);
		}else if(s.charAt(0)==')') {
			sum=10;
			for(int i = 0, k = 1; i<s.length()-1; k++,i++) {
				if(s.charAt(i)==s.charAt(k)) {
					sum+=5;
				}else {
					sum+=10;
				}
			}
			System.out.println(sum);
		}
			
		
	}	

}
