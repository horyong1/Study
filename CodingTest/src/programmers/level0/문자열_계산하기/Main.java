package programmers.level0.문자열_계산하기;

public class Main {

	public static void main(String[] args) {
		new Solution().solution("5 + 7 + 2 - 1 - 5");
	}

}
class Solution {
    public int solution(String my_string) {
        String[] strs = my_string.split(" ");
        int result = Integer.parseInt(strs[0]);
        
        int operand = 0;
        for(int i = 0; i < strs.length; i++) {
        	if(i % 2 == 0) {
        		operand *= Integer.parseInt(strs[i]);
        		result += operand;
        	}else if(strs[i].equals("+")) {
        		operand = 1;
        	}else {
        		operand = -1;
        		
        	}
        }
       	return result;
    }
    
}