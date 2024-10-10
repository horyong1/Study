package programmers.level0.배열의_유사도;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(String[] s1, String[] s2) {
//        return (int) Arrays.stream(s1)
//        		.filter(str -> Arrays.stream(s2).anyMatch(str::equals))
//        		.count();
    	int count = 0;
    	for(String str1 : s1) {
    		for(String str2 : s2) {
    			if(str1.equals(str2)) {
    				count++;
    			}
    		}
    	}
    	return count;
    }
}