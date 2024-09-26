package polymorpism;

public class AppleSpeakerImpl implements Speaker {

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker 소리를 올립니다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker 소리를 내립니다.");
		
	}

}
