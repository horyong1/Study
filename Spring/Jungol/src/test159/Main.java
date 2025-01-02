package test159;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		for(int i = 0;  i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--)	{
			System.out.println(arr[i]);
			
		}
	}

}
