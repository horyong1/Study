package programmers.basic.level0.최빈값_구하기;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3, 3, 4};
		System.out.println(new Solution().solution(a));
	}

}

class Solution {
	private int[] index;
    public int solution(int[] array) {
    	// 첫번째 방법
//    	int result = 0;
//    	Arrays.sort(array);
//    	int cnt = array[array.length-1];
//        index = new int[cnt+1];
//        
//        if(array.length == 1) {
//        	return array[0];
//        }
//        
//        for(int i = 0; i <array.length; i++) {
//        	index[array[i]]++;
//        }
//        
//        int max = 0;
//        for(int i = 0; i < index.length; i++) {
//        	int value = index[i];
//        	max = Math.max(max, value);
//        }
//        int count = 0;
//        for(int i = 0; i < index.length; i++) {
//        	if(index[i] == max) {
//        		result = i;
//        		count++;
//        	}
//        }
//        
//        
//        return count > 1 ? -1 : result;
    	
    	int result = 0;
    	int maxCount = 0;
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int number : array) {
    		int count = map.getOrDefault(number, 0) + 1;
    		
    		if(count > maxCount) {
    			maxCount = count;
    			result = number;
    			
    		}else if (count == maxCount){
    			result = -1;
    		}
    		map.put(number, count);
    	}
    	return result;
    }
}