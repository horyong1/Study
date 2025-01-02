package programmers.level0.약수구하기;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println();
		int[] arr = solution.solution(24);
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
class Solution {
    public int[] solution(int n) {
    	int index = 1;
        for(int i = 1; i <= n / 2; i++) {
        	if(n % i == 0) {
        		index++;
        	}
        }
        System.out.println(index);
        int[] answer = new int[index];
        int count = 0;
        for(int i = 1; i <= n / 2; i++) {
        	if(n % i == 0) {
        		answer[count] = i;
        		count++;
        	}
        }
        System.out.println(count);
        answer[count] = n;
        
        
        return answer;
    }
}