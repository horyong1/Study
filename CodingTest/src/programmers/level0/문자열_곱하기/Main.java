package programmers.level0.문자열_곱하기;

public class Main {
	public static void main(String[] args) {
		
	}
}

class Solution{
	public String solution(String my_string, int k) {
		String answer = plusString(my_string, k);
		
		return answer;
	}
	private String plusString(String my_string, int k) {
		String result = "";
		for(int i = 0; i < k; i++) {
			result += my_string;
		}
		return result;
	}
}