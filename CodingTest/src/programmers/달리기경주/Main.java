package programmers.달리기경주;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution{
	
	public String[] solution(String[] players, String[] callings) {
		Map<String,Integer> map = new HashMap<>();
		
		for(int i = 0; i < players.length; i++) {
			map.put(players[i], i);
		}
		
		for(String calling : callings) {
			int index = map.get(calling);
			
			if(index > 0) {
				String temp = players[index-1];
				players[index-1] = players[index];
				players[index] = temp;
				
				map.put(calling, index-1);
				map.put(temp, index);
			}
		}
		return players;
	}
}
//class Solution {
//    public String[] solution(String[] players, String[] callings) {
//        for(String calling : callings) {
//        	int index = -1;
//        	
//        	for(int j = 0; j < players.length; j++) {
//        		if(players[j].equals(calling)) {
//        			index = j;
//        			break;
//        			
//        		}
//        	}
//        	
//        	if(index > 0) {
//        		String temp = players[index];
//        		
//        		players[index] = players[index -1];
//        		players[index -1] = temp;
//        	}
//        }
//        return players;
//    }
//}