package test1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();
		
		char[][] arr = new char[num][num];
		char c = 'A';
		
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < num; j++) {
					if(c>'Z') c='A';
					arr[j][i] = c++;
				}
			}else {
				for(int j = num-1; j>=0; j--) {
					if(c>'Z') c='A';
					arr[j][i] = c++;
				}
			}
		}
		
		for(int i = 0; i<num; i++) {
			for(int j =0; j<num; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
