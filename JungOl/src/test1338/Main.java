package test1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		char [][] arr = new char[num][num];
		char c ='A';
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j<num; j++) {
				arr[i][j] = '\0';
			}
		}
		
		
		for (int i = 0; i < num; i++) {
		    for (int j = i, k = num-1; j < num; j++, k--) {
		        arr[j][k] = c++;
		        if(c > 'Z')
		            c = 'A';
		    }
		}
		
		for(int i =0; i<num; i++) {
			for(int j=0; j<num; j++) {

				
				if(arr[i][j]=='\0') {
					System.out.print(" "+" ");
				}else {
					System.out.print(arr[i][j]+" ");
					
				}
			}
			System.out.println();
		}

	}

}
