package p4;

public class App {

	public static void main(String[] args) {
		// SOLID 원칙 
		// S = SRP(단일 책임 원칠) : 클래스명, 메서드명에 맞게 작게 작게 나눠서 코딩(순수한 클래스 문법)
		// O = OCP(개방, 폐쇠 원칙) : 확장에는 열려있어야하고, 수정에는 닫혀야된다.
		// L = LSP(리스코프 치환 원칙) : 인터페이스 구현하는 사람은 딱 그대로 구현해야 한다
		// I = ISP(인터페이스 분리 원칙) : 인터페이스를 너무 크게 만들지 말고 차라리 다중 상속하도록 나눠서 만들어야 한다.
		// D = DIP(의존 역행 원칙) : IoC, DI 등등 결합도를 낮춘다. 단, 공장이 필요하다
		Flyable s = new AAA();
		s.fly();
//		s.swim();
	}

}

interface Flyable{
	public void fly();
	
}

interface Swimeable{
	public void swim();
	
}

class AAA implements Flyable,Swimeable{

	@Override
	public void fly() {
		
	}

	@Override
	public void swim() {
		
	}
	
}