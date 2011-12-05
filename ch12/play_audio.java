import java.awt.Graphics;
import java.applet.Applet;

public class play_audio extends Applet {
	public void paint(Graphics g) {
		g.drawString("Audio Test", 25, 25);
		play(getDocumentBase(), "audio.wav");
	}
}
