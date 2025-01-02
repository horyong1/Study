package programmers.level0.배열뒤집기;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int length = num_list.length-1;
        for(int i = 0 ; i < length/2; i++){
            int temp = num_list[i];
            num_list[i] = num_list[length-i];
            num_list[length-i] = temp;
        }
        return num_list;
    }
}