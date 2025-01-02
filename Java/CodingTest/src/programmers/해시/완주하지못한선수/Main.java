package programmers.해시.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.print(new Solution().solution(participant, completion));
	}

}
class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : participant) {
        	map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : completion) {
        	map.put(s, map.get(s) - 1);
        }
        
        for(Map.Entry<String, Integer> m : map.entrySet()) {
        	if(m.getValue() != 0) {
        		return m.getKey();
        	}
        }
//        for(String key : map.keySet()) {
//        	if(map.get(key) != 0) {
//        		return key;
//        	}
//        }
        
        return "";
    }
}