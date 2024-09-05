package ch05array;

public class EX04_p212 {
	public static void main(String[] args) {
		// 100,100,100 정수 3개의 값을 저장하는 배열 arr1을 생성한 후 값을 출력
		int intArr[] = { 100, 100, 100 };

		for (int arr : intArr) {
			System.out.print(arr + "\t");
		}
		System.out.println();
		
		// 2중 배열
		int intArr2[][] = {	{ intArr[0], intArr[1], intArr[2] },
							{ 10, 10, 10,2 },
							{ 1, 1, 1,7,8 },
							{ 23, 23 } };
		int cnt1 = 0;
		int cnt2 = 0;
		System.out.println(intArr[1] == intArr2[0][1]);
		System.out.println(intArr2);
		System.out.println(intArr2.length + "과목");
		
		for(int i = 0; i< intArr2.length; i++) {
			for(int j = 0; j<intArr2[i].length; j++) {
				System.out.print("intArr2"
						+"["+i+"]"+"["+j+"] = "+ intArr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===================="
				+ "===============================================");
		
		
		for (int arr[] : intArr2) {
			for(int a : arr) {
				System.out.print("intArr2"
			+"["+cnt1+"]"+"["+cnt2+"] = "+ a + "\t");
				cnt2++;
			}
			cnt1++;
			cnt2=0;
			System.out.println();
			
		}
	}
}
