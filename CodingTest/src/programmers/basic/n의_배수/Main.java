package programmers.basic.n의_배수;

public class Main {
	public static void main(String[] args) {
		
	}
}

class Solution{
	public int solution(int num, int n){
		int answer = 0;
		if(num % n == 0) {
			answer = 1;
		}else {
			answer = 0;
		}
		return answer;
	}
}
