package p5;

public class App {
	public static void main(String[] args) {
		
	}
}
// 1. Dto(Vo) = 데이터를 정의 하는 클래스
class StudentDto{
	private String name;
	private int age;
	private int score;
	
	public StudentDto(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	 
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
//2. 컴포넌트 = 기능 추가 되는 클래스 , 보통 1개만 생성함. 그리고 조립해야 함
class StudentDataManager{
	public void addStudent() {}
	public void deleteStudent() {}
}

class SomeComponent{
	
	public void run() {}
	public void foo() {}
}
// 3. Util - static으로만 이루어지는 경우가 많은 클래스. 글로벌로 활용
class SomeUtil {
	
	private SomeUtil() {}
	
	public static void test() {}
	public static void doSomething() {}
	
}