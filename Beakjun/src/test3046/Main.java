package test3046;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int R1, R2, S;
		
		R1 = sc.nextInt();
		S = sc.nextInt();
		sc.close();
		R2 = 2*S-R1;
		System.out.println(R2);
	}

}
