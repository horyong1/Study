package p4;

public class App {

	public static void main(String[] args) {
		BBB b1 = new BBB();
		AAA a1 = new AAA();
		CCC c1 = new CCC();
		DDD d1 = new DDD();
		
	}

}
// 한명의 부모에는 여려명의 자식이 있을수 있다.
// 부모는 무조건 한명
// 상속은 단방향 AAA는 상속 받은게 없기 때문에 다른 클래스 맴버변수 값 사용 불가 
class AAA{
	int a1;
	int a2;
}

class BBB extends AAA{
	int b1;
	int b2;
}
// CCC 클래스가 BBB를 상속하면 BBB가 AAA를 상속하기 떄문에 
// CCC 클래스는 AAA, BBB클래스를 사용 가능하다
// CCC는 AAA 가 조상관계
class CCC extends BBB{
	int c1;
	int c2;
}
// DDD와 CCC는 자손관계
class DDD extends BBB{
	int d1;
	int d2;
}
