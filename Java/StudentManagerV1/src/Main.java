
public class Main {
	public static void main(String[] args) {
		String str = "안13녕7하88세요";
		
		char[] arr = str.toCharArray();
		char aa = '9';
		String s = "";
		int cntt = 4;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] >= '0' && arr[i] <= '9') {
				if(i == cntt) {
					System.out.println(arr[i]);
					
				}
			}
			
		}
			
		System.out.println(s);
		
		if(str.equals(s)) {
			System.out.println("akwek");
		}

		
		
		String[] strArr = {"홍길동","김철수","이훈이","왕하오","홍길동","홍길동응"};
		int [] num = {1,2,3,4,5};
		String sa = "홍길동";
		char[] ch = sa.toCharArray(); 
		int cnt = 0;
		int[] index = null;
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < ch.length; j++) {
				char Sequals = strArr[i].charAt(j);  
				
				if( Sequals == ch[j] ) {
					cnt++;
				}
			}
			if(ch.length <= cnt) {
				System.out.println("이름 : " + strArr[i]);
				cnt = 0;
			}
		}
		
	
	}
}
