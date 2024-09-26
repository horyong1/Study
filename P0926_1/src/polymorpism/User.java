package polymorpism;

public class User {
	private Tv tv;
	
	public void watchTv() {
		System.out.println("사용자가 Tv를 봅니다.");
		System.out.println();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
				
		
		System.out.println();
		System.out.println("사용자가 TV를 종료 했습니다.");
		System.out.println("===================");
	}
	
	public void setTv(Tv tv) {
		this.tv = tv;
	}
	
}
