import java.awt.Graphics;
import java.applet.*;

public class loop_audio extends Applet {
	AudioClip sound;

	public void init() {
		sound = getAudioClip(getDocumentBase(), "audio.wav");
	}

	public void paint(Graphics g) {
		g.drawString("Loop Audio Test", 25, 25);
	}

	public void start() {
		sound.loop();
	}

	public void stop() {
		sound.stop();
	}
}
