package atcoder.B_UniqueNicknames;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 사람 수 
		String[] surName = new String[N]; 
		String[] givenName = new String[N];
		
		for(int i = 0; i < N; i++) {
			surName[i] = sc.next();
			givenName[i] = sc.next();
		}
		sc.close();
		
		
		for(int i = 0; i < N; i++) {
			boolean canUseSurname = true;
			boolean canUseGivenName = true;
		
			for(int j = 0; j < N; j++ ) {			
				if(i != j) {
					if(surName[i].equals(surName[j]) || surName[i].equals(givenName[j])) {
						canUseSurname = false;
					}
					if(givenName[i].equals(surName[j]) || givenName[i].equals(givenName[j])){
						canUseGivenName = false;
					}					
				}
			}
			
			if(!canUseSurname && !canUseGivenName) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
		
	}
}
