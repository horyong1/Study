package programmers.basic.level0.홀짝에_따라_다른_값_반환하기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if( n % 2 == 0) {
        	for(int i = 1; i <= n; i++) {
        		if( i % 2 == 0) {
        			answer += i*i;        			
        		}
        	}
        	return answer;
        }
        
        for(int i = 1; i <= n; i++) {
        	if( i % 2 != 0) {
        		answer += i;        		
        	}
    	}
        return answer;
    }
}