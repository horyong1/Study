package programmers.정렬.K번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(new Solution().solution(array, commands));
	}

}
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < commands.length; i++ ) {
//        	int x = commands[i][0];
//        	int max = commands[i][1];
//        	int value = commands[i][2];
//        	for(int j = x -1; j < max; j++) {
//        		list.add(array[j]);
//        	}
//        	list.sort(null);
//        	answer[i] = list.get(value-1);
//        	list.clear();
//        }
//        return answer;
//    }
//}
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++ ) {
        	int x = commands[i][0];
        	int j = commands[i][1];
        	int k = commands[i][2];
        	
        	int[] subArray = Arrays.copyOfRange(array, x-1, j);
        	Arrays.sort(subArray);
        	
        	answer[i] = subArray[k - 1];
        }
        return answer;
    }
}