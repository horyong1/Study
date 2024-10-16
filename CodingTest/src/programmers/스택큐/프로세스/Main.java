package programmers.스택큐.프로세스;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,9,1,1,1};
		new Solution().solution(arr, 0);
	}

}

class Solution{
	public int solution(int[] priorities, int location) {
		int answer = 0;
		int l = location;
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int a : priorities) {
			que.add(a);
		}
		
		Arrays.sort(priorities);
		int size = priorities.length - 1;
		
		while(!que.isEmpty()) {
			int i = que.poll();
			
			if(i == priorities[size - answer]) {
				answer ++;
				l--;
				if(l < 0) {
					break;
				}
			}else {
				que.add(i);
				l--;
				if(l < 0) {
					l = que.size() -1;
				}
			}
		}

		return answer;
	}
}

//class Solution{
//	public int solution(int[] priorities, int location) {
//		Queue<Integer> queue = new LinkedList<Integer>();
//		for(int i = 0; i < priorities.length; i++) {
//			queue.offer(i);
//		}
//		
//		int answer = 0;
//		while(!queue.isEmpty()) {
//			int process = queue.poll();
//			boolean check = false;
//			
//			for(int index : queue) {
//				if(priorities[index] > priorities[process]) {
//					check = true;
//					break;
//				}
//			}
//			
//			if(check) {
//				queue.offer(process);
//			}else {
//				answer++;
//				if(process == location) {
//					break;
//				}
//			}
//		}
//		return answer;
//		
//	}
//}