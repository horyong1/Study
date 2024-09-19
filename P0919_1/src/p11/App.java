package p11;

public class App {
	public static void main(String[] args) {
		Some s1 = new Some();
		Some s2 = new Some();
		
			s1.inscrease(1);
			s2.inscrease(20);
			
			s1.printMyValue();
			s2.printMyValue();
		
	}
}

class Some{
	int value = 0;
	
	void plus(int a, int b) {
		System.out.println(a + b);
	}
	
	void inscrease(int value) {
		this.value++;
		this.value += value++;
	}
	
	void printMyValue() {
		System.out.println(value);
		
	}
}