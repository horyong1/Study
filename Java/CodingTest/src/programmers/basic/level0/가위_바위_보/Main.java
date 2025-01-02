package programmers.basic.level0.가위_바위_보;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rsp.length(); i++) {
        	if(rsp.charAt(i)== '2') {
        		sb.append("0");
        	}
        	
        	if(rsp.charAt(i)== '0') {
        		sb.append("5");
        	}
        	
        	if(rsp.charAt(i)== '5') {
        		sb.append("2");
        	}
        }
        return String.valueOf(sb);
    }
}