package polymorpism;

public class SamsungTv implements Tv {
	
	public void powerOn() {
		System.out.println("SamSung TV - 전원이 켜집니다.");
	}
	
	public void powerOff() {
		System.out.println("SamSung TV - 전원이 꺼집니다.");
	}
	
	public void volumeUp() {
		System.out.println("Samsung TV - 소리를 올립니다.");
	}
	
	public void volumeDown() {
		System.out.println("Samsung TV - 소리를 내립니다.");
	}
}
