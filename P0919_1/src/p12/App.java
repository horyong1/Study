package p12;

public class App {
	public static void main(String[] args) {
		Student hanjo = new Student();
		hanjo.name = "한조";

		Student tracer = new Student();
		tracer.name = "트레이서";
		
		hanjo.study(5);
		tracer.study(1);
		tracer.study(2);
		hanjo.study(3);
		
		hanjo.showResult();
		tracer.showResult();
		
	}
}



class Student{
	String name;
	int score;
	
	void study(int hour) {
		System.out.println(name + "가 공부 합니다. " + hour +"시간");
		score += hour * 3;
	}
	
	void showResult() {
		System.out.println(name + "는 " + score + "점 입니다.");
	}
}
