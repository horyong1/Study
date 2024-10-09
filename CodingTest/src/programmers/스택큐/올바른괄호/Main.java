package programmers.스택큐.올바른괄호;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().solution("()()"));
	}

}
class Solution {
	boolean solution(String s) {
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.push(1);
			}else {
				if(st.isEmpty()) {
					return false;
				}
				st.pop();
			}
		}
		
		return st.isEmpty();
	}
}

//class Solution {
//    boolean solution(String s) {
//    	int cnt = 0;
//        for(int i = 0; i < s.length(); i++) {
//        	if(s.charAt(i) == '(') {
//        		cnt++;
//        	}else {
//        		cnt--;
//        	}
//        }
//        
//        if(cnt < 0) {
//        	return false;
//        }
//     
//        return  cnt == 0; 
//    }
//}