package leetcode.algorithms.Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}