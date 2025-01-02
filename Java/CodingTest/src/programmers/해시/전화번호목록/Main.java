package programmers.해시.전화번호목록;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
//        Set<String> set = new HashSet<>();
//        for(String s : phone_book) {
//        	if(set.contains(s)) {
//        		answer = false;
//        		break;
//        	}
//        	set.add(s);
//        }
//			
        Arrays.sort(phone_book);
        
        for(int i = 0; i < phone_book.length-1; i++) {
        	
    		if(phone_book[i+1].startsWith(phone_book[i])) {
    			return false;
    		}
        		
        	
        }
        return answer;
    }
}