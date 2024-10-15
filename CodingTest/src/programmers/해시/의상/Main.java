package programmers.해시.의상;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        for(String[] s  : clothes) {
        	String str = s[1];
        	map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        for(int n : map.values()) {
        	answer *= (n+1);
        }
        return answer -1;
    }
}