package p4;

public class App {
	public static void main(String[] args) {
		// getInstance면 싱글톤 패턴이 적용된 것
		Some.getInstance();
	}
}



/**
 *  
 * */
class Some{
	// 여러.. 속성들
	// 여러 메소드들
	public void test() {
		
	}

	private static final Some instance = new Some();
//	private static Some instance = null;
	
	// 싱글톤 패턴
	private Some() {
		
	}
	
	public static Some getInstance() {
		// 인스턴스가 널이면 인스턴스에 new Some 생성자 생성 해줌 
		// 이 코드로 생성자를 1개로 제한함.
//		if(instance == null) {
//			instance = new Some();
//		}
		
		return instance;
	}
	
}
