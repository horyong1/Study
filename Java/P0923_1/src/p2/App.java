package p2;

public class App {
	public static void main(String[] args) {
		// API = 프로그램을 쉽게 만들게하기 위해 누군가 만든 도구
		
		String str = "안녕하세요, 반갑습니다, 저는 IU입니다.";
		String searchWord = " Iu";
		
		int count = str.length();
		
		String result = str.replace("아이유", "차은우");
		
		System.out.println(count);
		System.out.println(result);
		System.out.println(searchWord);
		
		
		searchWord = searchWord.trim();
		System.out.println(searchWord);
		
		searchWord = searchWord.toUpperCase();
		System.out.println(searchWord);
		
		//메소드 체이닝 이렇게도 가능함 앞부터 시작
		String a = searchWord.trim().toUpperCase();
		System.out.println(a);
		
		if(str.toUpperCase().contains(searchWord)) {
			System.out.println("검색어 포함 O");
		}else{
			System.out.println("검색어 포함 X");
		}
		
		String qwer = new String("ddd");

		String qqq = new String("ada");
		
		System.out.println(qqq);
		System.out.println(qwer);
		
		
	}
}
