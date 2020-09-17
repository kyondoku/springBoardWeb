package polymorphism;

public class LgTV implements Tv {
	
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV 객체화!!!");
	}
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다.");	
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();	
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
