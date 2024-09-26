package polymorpism;
/**
 * 인터페이스 사용을 해야 하는 이유 
 * 확장에는 열려 있어야 하고 수정에는 닫혀 있어야 한다.(최소한의 수정)
 * 공통으로 사용 되는 기능은 인터페이스로 하나로 묶어서 사용 가능하게 끔 함 
 * 나중에 다른 클래스를 만들더라고 인터페이스에 기능을 정의 해두면 그걸 사용 하면 됨
 * 결국은 인터페이스는 표준을 정의한다고 보면 됨(표준이 정해져 있으면 모듈을 교체 하더라도 잘 작동 됨)
 * 인터페이스를 정의 해야함 
 * */
public class App {
	public static void main(String[] args) {
		User user = new User();
		user.watchTv();
		
		
		Tv tv = new LgTv();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		System.out.println("사용자가 TV를 종료 했습니다.");
	}
}
