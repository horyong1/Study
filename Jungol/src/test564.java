import java.util.Scanner;

public class test564 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26] ;
		
		for(int j = 0; j<arr.length; j++ ) {
			arr[j] = 0;
		}
		
		while(true) {
			char c = sc.next().charAt(0);
			
			if (c < 'A' || c > 'Z') {
				sc.close();
				break;
			}
			arr[(int)c-65]++;
		}
	
		for(int j = 0; j<arr.length; j++) {
			if(arr[j] != 0) {
				System.out.println((char)(int)(j+65)+" : " + arr[j]);
			}
		}
		

	}

}

