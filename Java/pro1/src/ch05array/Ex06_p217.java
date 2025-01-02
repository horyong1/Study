package ch05array;

import java.util.Arrays;

/**
 * 배열은 생성 시 지정된 크기를 변경할 수 없다.
 * 따라서 더 많은 저장 공간이 필요하다면 
 * 더큰 배열을 새로 만들고 
 * 이전 배열로부터 항목 값들을 복사해야 한다. => 깊은 복사(Deep Copy)
 * ex) clone(), Arrays.copyof() 
 * 또는
 * 이전 배열로부터 주소를 복사해야 한다. => 얕은 복사(Shallow Copy) 
 * 원본과 사본배열이 동일한 주소(객체)를 참조한다.
 * 따라서 원본의 값이 변경이 되면 사본배열의 값도 변경이 된다.
 * */

public class Ex06_p217 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		System.out.println("arr1 = " + arr1);
		
		//원본의 값이 변경 되었어도 서로 주소값이 다르기때문에 새 배열의 값은 변경되지 않음  
		int[] arr2 = arr1.clone();
		arr1[4] = 100;
		System.out.println("arr2 = "+ arr2);
		
		/**
		 * Arrays.copyof(원본배열, 새 배열 길이);
		 * 원본 배열의 값을 그대로 복사
		 * 원본 배열보다 크면 나머지 부분은 자동 초기화로 됨 
		 * 주소가 다르기때문에 깊은 복사
		 * */
		int[] arr3 = Arrays.copyOf(arr1, 6);
		arr1[3] = 150;
		System.out.println("arr3 = "+ arr3);
		
		/**
		 * Arrays.copyOfRange(원본배열,시작번지,마지막번지)
		 * 원본 배열 값 중에 특정 부분만 범위를 정해서 복사를 함
		 * 시작번지에서부터 마지막 번지 전까지 복사함
		 * 깊은 복사
		 * */
		int[] arr4 = Arrays.copyOfRange(arr1, 1, 4);
		System.out.println("arr4 = "+ arr4);
		
		
		int[] arr5 = new int[10];
		System.arraycopy(arr1, 0, arr5, 2, 4);
		System.out.println("arr5 = "+ arr5);

		System.out.println("====================================================");
		System.out.print("arr1  :::  ");
		for( int a : arr1) {
			System.out.print(a + "\t");
		}
		
		System.out.println();
		System.out.println("====================================================");
		
		System.out.print("arr2  :::  ");
		for( int a : arr2) {
			System.out.print(a + "\t");
		}

		System.out.println();
		System.out.println("====================================================");
		
		System.out.print("arr3  :::  ");
		for( int a : arr3) {
			System.out.print(a + "\t");
		}
		System.out.println();
		System.out.println("====================================================");
		
		System.out.print("arr4  :::  ");
		for( int a : arr4) {
			System.out.print(a + "\t");
		}
		System.out.println();
		System.out.println("====================================================");

		System.out.print("arr5  :::  ");
		for( int a : arr5) {
			System.out.print(a + "\t");
		}
		System.out.println();
		System.out.println("====================================================");
	}
}
