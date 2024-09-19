package p05;

public class App {

	public static void main(String[] args) {
		School school = new School();
		school.list[0] = new Student();
		
	}

}


class School{
	String name;
	Student[] list = new Student[5];
}

class Student{
	String name;
	int age;
	int score;
}