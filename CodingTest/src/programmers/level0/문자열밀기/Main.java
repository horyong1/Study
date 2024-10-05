package programmers.level0.문자열밀기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.solution("hello", "ohell"));
	}

}
class Solution {
    public int solution(String A, String B) {
 
        if( A.equals(B)) {
        	return 0;
        }
        
        String str = A;
        for(int i = 1; i <= A.length(); i++) {
        	str = change(str);
        	if(str.equals(B)) {
        		return i;
        	}
        }
        return -1;
    }
    
    private String change(String str) {
    		str = str.charAt(str.length() - 1) 
        		+ str.substring(0,str.length()-1);
    	 	return str ;
    }
}