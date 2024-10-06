package programmers.level0.문자열_정렬하기2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Solution().solution("Bcad");
	}

}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] c = my_string.toLowerCase().toCharArray();
        
//        for(int i = 0; i < c.length; i++) {
//        	for(int j = i + 1; j < c.length; j++) {
//        		if(c[i] > c[j]) {
//        			char temp = c[i];
//        			c[i] = c[j];
//        			c[j] = temp;
//        		}
//        	}
//        	answer += c[i];
//        }
        Arrays.sort(c);
        return new String(c);
    }
}