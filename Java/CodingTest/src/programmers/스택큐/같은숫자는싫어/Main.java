package programmers.스택큐.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] != arr[i-1]){
        		list.add(arr[i]);
        	}
        }
    	
        return list.stream().mapToInt(i -> i).toArray();
    	
//        Stack<Integer> stack = new Stack<>();
//        
//        stack.push(arr[0]);
//        for(int i = 1; i < arr.length; i++) {
//        
//        	if(stack.peek() != arr[i]) {
//        		stack.add(arr[i]);
//        	}
//        }
//        int[] answer = new int[stack.size()];
//        
//        for(int i = 0; i < answer.length; i++) {
//        	answer[i] = stack.get(i);
//        }
//        return answer;
    }
}