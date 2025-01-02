package test1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		int cross_count = 1, count_sum = 0;

		while (true) {

			if (x <= (cross_count + count_sum)) {
				if (x % 2 != 0) {
					System.out.println();
				}else {
					
				}
			} else {
				count_sum += cross_count;
				cross_count++;
			}

		}
	}

}
