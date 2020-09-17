package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements Tv {
	@Autowired
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
