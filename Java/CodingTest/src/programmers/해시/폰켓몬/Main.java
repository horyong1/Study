package programmers.해시.폰켓몬;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums) {
        	set.add(n);
        }
        
        return max < set.size() ? max : set.size();
    }
}