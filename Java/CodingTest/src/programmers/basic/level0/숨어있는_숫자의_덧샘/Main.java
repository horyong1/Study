package programmers.basic.level0.숨어있는_숫자의_덧샘;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Solution().solution("aAb1B2cC34oOp");
	}

}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
        	char c = my_string.charAt(i);
        	if(Character.isDigit(c)) {
        		answer += c - '0';
        	}
    	}
        return answer;
    }
}