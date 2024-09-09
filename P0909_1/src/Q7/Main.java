package Q7;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int sum = 0;
		for(int i = 0; i < 8; i++) {
			if(i == 0) {
				arr[0] = 1;
				arr[1] = 1;
			}
			sum = arr[i]+arr[i+1];
			arr[i+2] = sum;
		}

		for(int a : arr) {
			System.out.println(a);
			
		}
		
		System.out.println(arr[9]);

	}
}
