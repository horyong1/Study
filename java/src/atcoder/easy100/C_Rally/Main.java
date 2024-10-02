package atcoder.easy100.C_Rally;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for(int i = 0; i < N; i++){
            result += new Solution().solution(N, sc.nextInt());
        }
        sc.close();
        System.out.println(result);
        
    }
}



class Solution{
    int solution(int A, int B){
        int result = A - B;
        return result * result;
    }
}
