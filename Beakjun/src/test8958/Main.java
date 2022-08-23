package test8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			String str = sc.next();
			for(int j = 0; j<str.length(); j++) {
				char c = str.charAt(j);
				if(c=='O') {
					cnt++;
					sum+=cnt;
				
				}else {
					cnt=0;
				}
			}
			System.out.println(sum);
			sum=0;
			cnt=0;
		}
		sc.close();
	}

}
