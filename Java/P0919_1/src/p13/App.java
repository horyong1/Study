package p13;

public class App {
	public static void main(String[] args) {
		Some s1 = new Some();
		s1.qwer();
		s1.qwer("반가워요");
	}
}

class Some{
	// 메서드 오버로딩(메서드 오버로딩은... 그닥.. 적당히 알아만 둘것) : 오버라이딩하는법 중요함
	
	void qwer() {
		System.out.println("안녕하세요");
	}
	
	void qwer(String str) {
		System.out.println(str);
	}
}
