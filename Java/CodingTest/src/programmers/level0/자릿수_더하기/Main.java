package programmers.level0.자릿수_더하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        
//        for(int i = 0; i < str.length(); i++) {
//        	answer += str.charAt(i) - '0';
//        }
        Arrays.stream(str.split("")).mapToInt(Integer::parseInt).sum();
        return answer;
    }
}