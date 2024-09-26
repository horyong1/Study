package polymorpism;

public class LgTv implements Tv{
	
	public void powerOn() {
		System.out.println("LG TV - 전원이 켜집니다.");
	}
	
	public void powerOff() {
		System.out.println("LG TV - 전원이 꺼집니다.");
	}
	
	public void volumeUp() {
		System.out.println("LG TV - 소리를 올립니다.");
	}
	
	public void volumeDown() {
		System.out.println("LG TV - 소리를 내립니다.");
	}
}
