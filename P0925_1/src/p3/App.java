package p3;
/**
 * 상속 + 다형성 + 오버라이딩 => 인터페이스(자바의 꽃)
 * 결합도를 낮추는 프로그래밍
 * 추상화 레벨을 잘 생각해서 맞춰서 개발 해야함 
 * 잘못된 방법으로 추상화를 하다보면 코드가 망함
 * */
public class App {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setAge(10);
		
		Police p = new Police();
		p.setName("결아");
		
		System.out.println(st1.getAge());
		System.out.println(p.getName());
	}

}

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
// Person을 상속 받고 있음
class Student extends Person{
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

class Police extends Person{
	//........기타 등등
}
