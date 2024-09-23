package ch05array;

import java.util.Scanner;

public class Ex04_p219 {
	public static void main(String[] args) {
		// 입력을 Scanner로 받아서 처리하면 buffer를 겨쳐서된
		Scanner sc = new Scanner(System.in);
		
		/**
		 * nextInt()로 받으면 입력 후 엔터를 하게 되면 개행문자(\n)이
		 * 남는데 이후 nextLine()으로 받으면 개행문자가 먼저 읽히기 때문에
		 * 첫번째에 해당 요소가 들어감 
		 * */
//		int num = Integer.parseInt(sc.nextLine());
		int num = sc.nextInt();
		sc.nextLine();	//이런식으로 개행문자를 처리해줘야 제대로 입력값이 들어감
		String [] arr = new String[num];
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		sc.close();
		
		for(String arr1 : arr) {
			System.out.println(arr1);
		}
	}
}
