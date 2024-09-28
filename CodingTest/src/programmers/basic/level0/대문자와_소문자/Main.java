package programmers.basic.level0.대문자와_소문자;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public String solution(String my_string) {
        String answer = "";
//        for(int i = 0; i < my_string.length(); i++) {
//        	char c = my_string.charAt(i);
//        	if(c >= 'A' && c <= 'Z') {
//        		c = (char) (c + ('a' - 'A'));
//        	}else if(c >= 'a' && c <= 'z') {
//        		c = (char) (c - ('a' - 'A'));
//        		
//        	}
//        	answer += c;
//        }
        for(int i = 0; i < my_string.length(); i++) {
        	char c = my_string.charAt(i);
        	if(c >= 'A' && c <= 'Z') {
        		c = Character.toLowerCase(c);
        	}else if(c >= 'a' && c <= 'z') {
        		c = Character.toUpperCase(c);
        		
        	}
        	answer += c;
        }
        return answer;
    }
}