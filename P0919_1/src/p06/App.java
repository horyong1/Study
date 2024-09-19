package p06;

public class App {
	public static void main(String[] args){
//		Person p1 = new Person();
//		p1.name = "한조";
//		p1.age = 30;
//
//		Person p2 = new Person();
//		p2.name = "메르시";
//		p2.age = 40;
//		
//		Person p3 = new Person();
//		p3.name = "트레";
//		p3.age = 50;
		
		System.out.println("시작");
		System.out.println("1");
		Person p1 = new Person("한조",30);
		System.out.println("2");
		Person p2 = new Person("메르시",40);
		Person p3 = new Person("트레",50);
		
		
		System.out.println("끝");
	}
}

class Person{
	// 속성 정의
	String name;
	int age;
	
	// 생성자 정의 문법 : 클래스명(매개변수N....){}
	// 인스턴스(메모리) 생성 후 즉시 실행됨 인스턴스 생성당 단 한번씩
	public Person(String name, int age) {
		// 로직 구현 구간
		System.out.println("야호");
		this.name = name;
		this.age = age;
	}

	
	
}