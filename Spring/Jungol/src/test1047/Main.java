package test1047;

import java.util.Scanner;

public class Main {
	
	public static int f(int p) {
		if(p==1)
			return 1;
		else if(p==2)
			return 1;
		else
			return f(p-1)+f(p-2);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		System.out.print(f(N));

		
//		int sum = 0;
//		int N = sc.nextInt();
//		sc.close();
//		
//		int [] arr = new int[N];
//		
//		if(N==1) {
//			arr[0] = 1;
//		}else {
//			arr[0] = 1;
//			arr[1] = 1;
//		}
//		
//		for(int i = 1, j=0; i<N; i++,j++) {
//			arr[i]=arr[j]+arr[j+1];
//		}
//
//		sum=arr[N-1];
//		System.out.println(sum);
	
	}
}
