package ch05array;

/**
 * 배열은 생성 시 지정된 크기를 변경할 수 없다.
 * 따라서 더 많은 저장 공간이 필요하다면 
 * 더큰 배열을 새로 만들고 
 * 이전 배열로부터 항목 값들을 복사해야 한다. => 깊은 복사(Deep Copy)
 * 
 * 또는
 * 이전 배열로부터 주소를 복사해야 한다. => 얕은 복사(Shallow Copy) 
 * 원본과 사본배열이 동일한 주소(객체)를 참조한다.
 * 따라서 원본의 값이 변경이 되면 사본배열의 값도 변경이 된다.
 * */

public class Ex05_p217 {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		System.out.println("arr1 = " + arr1);
		
		arr1[4] = 60;
		for( int a : arr1) {
			System.out.print(a + "\t");
		}
		
		System.out.println();
		System.out.println("=========================");
		
		int[] arr2 = arr1;
//		arr2[4] = 55;
		System.out.println("arr2 = "+ arr2);
		for( int a : arr2) {
			System.out.print(a + "\t");
		}
		
	}
}
