package test1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		sc.close();
		
		int sum = 0 , cnt = 0, a = 0, b = 0;
		
		if(n1==1) {
			b=n1%10;
		
		}else if(n1==0) {
			cnt++;
		
		}else {
		
			a=n1/10;
			b=n1%10;
		}
		
		while(true) {
		
			if(n1==sum) {
				break;
			
			}else {
				
				sum = a + b;
				sum = (b*10)+sum%10;
				
				a = sum/10;
				b = sum%10;
				
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
