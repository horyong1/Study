package programmers.basic.level0.가장큰수찾기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++) {
    		if(array[i] > max) {
    			max = array[i];
    			index = i;
    		}		
        }
        answer[0] = max;
        answer[1] = index;
        
        return answer;
    }
}