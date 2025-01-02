package p14;

public class App {
	public static void main(String[] args) {
		Some s1 = new Some(10,20);
//		s1.v1 = 10;
//		s1.v2 = 20;

		Some s2 = new Some(32,55);
//		s2.v1 = 32;
//		s2.v2 = 55;
		
	}
}

class Some{
	int v1;
	int v2;
	
	
	// 생성자 문법: 클래스명( 파라메터N ){ 로직구간 } -> 파라메터는 없을 수도 있을수도 있음
	// 인스턴스 생성 후 바로 1회 자동 실행.
	// 일반적으로 초기값 세팅용
	Some(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
		showPrint();
	}
	
	Some() {
		
	}
	
	void showPrint() {
		System.out.println("초기값 : " +v1 + ", " + v2);
		
	}
	
}