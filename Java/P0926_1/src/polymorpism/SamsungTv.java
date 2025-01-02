package polymorpism;

public class SamsungTv implements Tv {
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("SamSung TV - 전원이 켜집니다.");
	}
	
	public void powerOff() {
		System.out.println("SamSung TV - 전원이 꺼집니다.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
	/**
	 * @param speaker the speaker to set
	 */
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	
}
