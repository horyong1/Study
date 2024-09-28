package programmers.basic.level0.짝수의합;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().solution(10));
	}

}
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i+=2) {
        		answer += i;        		
        	
        }
        return answer;
    }
}