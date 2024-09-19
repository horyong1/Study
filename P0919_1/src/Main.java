


/**
 * 클래스 
 * 
 * */
public class Main {
	public static void main(String[] args) {
		System.out.println("안녕");
		StudentData a;
		StudentData st1 = new StudentData();	// 참조변수 선언 & 인스턴스 생성(new)
		new StudentData(); // 인스턴스 생성: 사실상 참조변수 없이는 의미 없음
		
		st1.setAge(10);
		System.out.println(st1.getAge());
		
		StudentData st2 = new StudentData();
//		String qqq = new StudentData() 
				
		
	}
	
}

/**
 * 클래스 선언(정의) 문법
 * 클래스 명명법 : 아무렇게나 이름 지으면 되긴한데, 파스칼 케이스 = 대문자로 시작 나머지 소문자
 * 클래스 선언만으로는 아무일도 발생하지 않음
 * 클래스 선언이 되어 있으면 그에 해당하는 변수를 선언할 수 있다.
 * 클래스 선언은 가급적 파일 하나당 한개씩 선언한다.(정답은 아니지만 일반적)
 * */
class StudentData{
	// 속성 = 필드 = 인스턴스 변수
	private String name;
	private int age;
	private int score;
	
	// 생성자
	public StudentData() {
		
	}
	public StudentData(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	// 메서드(기능)
	
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
