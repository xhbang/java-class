import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class SoundExample extends Applet implements MouseListener {
	AudioClip soundFile1;
	AudioClip soundFile2;

	public void init() {
		soundFile1 = getAudioClip(getDocumentBase(), "dataS.au");
		soundFile2 = getAudioClip(getDocumentBase(), "shootS.au");
		addMouseListener(this);
		setBackground(Color.yellow);
		soundFile1.play();
	}

	public void paint(Graphics g) {
		g.drawString("Click to hear a sound", 20, 20);
	}

	public void mouseClicked(MouseEvent evt) {
		soundFile2.play();
	}

	public void mousePressed(MouseEvent evt) {
	}

	public void mouseReleased(MouseEvent evt) {
	}

	public void mouseEntered(MouseEvent evt) {
	}

	public void mouseExited(MouseEvent evt) {
	}
}
