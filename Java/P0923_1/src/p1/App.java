package p1;

public class App {
	public static void main(String[] args) {
		StudentDto st1 = new StudentDto("한조", 30, 50);
		StudentDto st2 = new StudentDto("트레", 20, 30);
		StudentDto st3 = new StudentDto();
		
		st1.test1();
		st1.test1();
		st1.test1();

		st1.test2(3, "안녕");
		st1.test2(3, "안녕");
		st1.test2(3, "안녕");
	
		int a = st1.test3();
		
		int studentCount = 0;
		
		st1.test4();
	}
}
