package programmers.basic.두_수의_연산값_비교하기;

public class Main {
	public static void main(String[] args) {
		System.out.println(new Solution().solution(2, 91));
	}
}

class Solution{
	public int solution(int a, int b){
		int plus = Integer.parseInt(""+a+b);
		int sum = 2 * a * b;
		int answer = plus > sum ? plus: sum;
		
		return answer;
	}
}
