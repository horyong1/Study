package polymorpism;

public class SonySpeakerImpl implements Speaker{

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker 소리를 올립니다.");		
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker 소리를 내립니다.");		
	}

}
