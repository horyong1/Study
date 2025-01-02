package programmers.완전탐색.최소직사각형;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution{
	public int solution(int[][] sizes) {
		int w = 0; 
		int h = 0;
		for(int[] card : sizes) {
			w = Math.max(w, Math.max(card[0], card[1]));
			h = Math.max(h, Math.min(card[0], card[1]));
		}
		
		return w * h ;
	}
}
//class Solution {
//    public int solution(int[][] sizes) {
//        int answer = 0;
//        
//        int w = 0;
//        int h = 0;
//        for(int i = 0; i < sizes.length; i++) {
//        	for(int j = 0; j < sizes[i].length-1; j++) {
//        		if(sizes[i][j] < sizes[i][j+1]) {
//        			int temp = sizes[i][j];
//        			sizes[i][j] = sizes[i][j+1];
//        			sizes[i][j+1] = temp;
//        		}
//        		
//        		if(sizes[i][j] > w) {
//        			w = sizes[i][j];
//        		}
//        		if(sizes[i][j+1] > h) {
//        			h = sizes[i][j+1];
//        		}
//        	}
//        }
//        
//        answer = w * h;
//        
//        return answer;
//    }
//}