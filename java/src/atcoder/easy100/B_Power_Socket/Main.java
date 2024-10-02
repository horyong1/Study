package atcoder.easy100.B_Power_Socket;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = new Solution().solution(sc.nextInt(), sc.nextInt());
        sc.close();
        System.out.println(result);
        
    }
}

class Solution{
    int solution(int A, int B){
        int count = 0;
        int sockets = 1;

        while (sockets < B) {
            sockets += A - 1;
            count++;
        }
        
        return count;
    }
}
