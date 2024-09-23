package p2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Some s1 = new Some();
		s1.b = 10;
		s1.a = 109;
	}

}
// 접근 제한자 - 사실은 정말 중요!! 
// 클래스 설계 원칙 : 캡슐화, 정보의 은닉
class Some{
	public int a;
	protected int b;	// 넘어가자
	int c;				// 넘어가자
	private int d;
}