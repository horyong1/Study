package p1;

public class StudentDto {
	// 속성 - 모든 속성은 private
	private String name = "";
	private int age;
	private int score;
	
	// NoArgConstructor
	public StudentDto() {
		System.out.println("생성자1 호출됨!!!");
	}
	
	// 생성자 - 실행 시점 - 각 인스턴스 생성 직후
	// AllArgConstructor
	public StudentDto(String name, int age, int score) {
		// 로직 구현 가능
		System.out.println("생성자2 호출됨!!!");
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	// 기능 - 언젠가 누군가가 호출해야 실행됨. 다중으로 호출 가능
	public void test1() {
		// 로직 정의... 안쪽에서 this가 안쓰이면. 응집도에 문제가 있을 수 있다.
		System.out.println("test1 로직 실행됨....: " + name);
	}
	
	
	public void test2(int a, String b) {
		System.out.println("test2 로직 실행됨....: " + a + b);
	}
	
	public int test3() {
		System.out.println("test3 로직 실행됨......: " + score);
		int result = score + 3;
		return result;
	}
	
}
