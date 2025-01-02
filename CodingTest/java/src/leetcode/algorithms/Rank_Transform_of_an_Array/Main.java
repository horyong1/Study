package leetcode.algorithms.Rank_Transform_of_an_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,10,10,10};
        new Solution().arrayRankTransform(arr);
    }
}

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        Map<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int num : sortedArr){
            if(!map.containsKey(num)){
                map.put(num, rank);
                rank++;
            }
        }
        
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
           result[i] = map.get(arr[i]);
        }


        return result;
    }
    
}