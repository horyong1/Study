import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i) - '0';
		}
		int result = arr[0];
		
		for(int i = 1; i < arr.length; i++ ) {
			if(arr[i] <= 1 || result <= 1) {
				result += arr[i];
			}else {
				result = result * arr[i];
			}
		}
		sc.close();
		System.out.println(result);
		
	}
}
