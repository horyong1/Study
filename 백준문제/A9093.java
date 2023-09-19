package q9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//readLine() 시 리턴값이 String으로 고정되어 형변환 필요
		int input = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < input; i++) {
			//입력된 문자 화이트스페이스 단위로 잘라 배열로 저장함
			String[] arrStr = br.readLine().split(" ");

			for (String str : arrStr) {
				// 문자열들을 합치기 위해 StringBuilder 사용
				StringBuilder sb = new StringBuilder(str);
				// reverse()를 이용하여 반대로 출력 되게 함
				System.out.print(sb.reverse().toString() + " ");
			}
			System.out.println();
		}

		/**
		 * Scanner이용해서 만들었으나 많은 반복문으로 시간초과 실패
		 */
//		Scanner sc = new Scanner(System.in);
//
//		int input = 0;
//		String st = "";
//		String[] arr = {};
//		
//		input = sc.nextInt();
//		
//		for (int k = 0; k <= input; k++) {
//			st = sc.nextLine();
//			arr = st.split("\\s");
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = arr[i].length(); j > 0; j--) {
//
//					System.out.print(arr[i].charAt(j - 1));
//
//				}
//				if (i <= arr.length) {
//
//					System.out.print(" ");
//				}
//			}
//		}
//		sc.close();
	}
}
