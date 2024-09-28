package programmers.basic.level0.옷가게_할인_받기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if( price >= 500000) {
        	return answer = (int)(price * 0.8);
        }
        
        if( price >= 300000) {
        	return answer = (int)(price * 0.9);
        }
        
        
        if( price >= 100000) {
        	return answer = (int)(price * 0.95);
        }
        return price;
    }
}