package test565;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=0;
		}
		
		while(true) {
			int num = sc.nextInt();
			
			if(num>=100 || num==0) {
				sc.close();
				break;
			}
			
			arr[num/10]++;
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(i + " : " + arr[i]);
				
			}
		}
	}

}
