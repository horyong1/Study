package programmers.basic.level0.다음에_올_숫자;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int[] common) {
        
        int num1 = common[1] - common[0];
        int num2 = common[2] - common[1];
    	
        if(num1 == num2) {
        	return common[common.length-1] + num1;
    	}else {
    		int ratio = common[1]/common[0];
    		return common[common.length-1] * ratio ;
    	}
    	
    	
    }
}