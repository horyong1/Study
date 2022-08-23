package test1339;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		char[][] arr = new char[101][101];
		if(inp%2==0 ||(inp>100||inp<1)) {
			System.out.println("INPUT ERROR");
			sc.close();
			System.exit(0);
		}
		char ch = 'A';
		
		for(int i=0; i<=inp/2; i++) {
			for(int j=inp/2-i; j<=inp/2+i; j++) {
				arr[j][inp/2-i]=ch++;
				if(ch>'Z')
					ch='A';
			}
		}
		for(int i =0; i<inp; i++) {
			for(int j=0; j<inp; j++) {
				if(arr[i][j]==0) {
					System.out.print("  ");
				}else {
					System.out.print(arr[i][j]+" ");
					
				}
			}
			System.out.println();
		}
		
	}

}
