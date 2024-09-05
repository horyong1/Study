package ch01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NewStack ns = new NewStack();
		int num = sc.nextInt();
		int n1 = 0;
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			String str = sc.nextLine();
			String[] control = str.split(" ");

			switch (control[0]) {
			case "push":
				n1 = Integer.parseInt(control[1]);
				ns.push(n1, cnt);
				cnt++;
				break;
			case "pop":
				cnt--;
				if (cnt < 0) {
					cnt = 0;
				}
				ns.pop(cnt);
				break;
			case "size":
				ns.size(cnt);
				break;
			case "empty":
				ns.empty(cnt);
				break;
			case "top":
				ns.top(cnt);
				break;

			}

		}
		sc.close();
	}
}

class NewStack {
	private int[] arr = new int[10000];

	public NewStack() {

	}

	public void push(int n1, int cnt) {
		arr[cnt] = n1;
	}

	public void pop(int cnt) {
		if (arr[cnt] == 0) {
			System.out.println(-1);
		} else {
			System.out.println(arr[cnt]);
			arr[cnt] = 0;
		}
	}

	public void size(int cnt) {
		System.out.println(cnt);
	}

	public void empty(int cnt) {
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			sum += arr[i];
		}

		if (sum == 0) {
			System.out.println(1);

		} else {
			System.out.println(0);
		}
	}

	public void top(int cnt) {
		if (cnt == 0) {
			System.out.println(-1);
		} else {
			System.out.println(arr[cnt - 1]);

		}

	}

}
