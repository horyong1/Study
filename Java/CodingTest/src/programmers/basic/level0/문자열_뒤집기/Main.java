package programmers.basic.level0.문자열_뒤집기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Solution {
    public String solution(String my_string) {
        return reversePrint(my_string); 
    }
    
    private String reversePrint(String my_string) {
    	return new StringBuilder(my_string).reverse().toString();
    }
}