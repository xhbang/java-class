import java.awt.*;
import java.applet.*;

public class Display_Image extends Applet {
	Image labmag;

	public void init() {
		labmag = getImage(getDocumentBase(), "image.jpg");
	}

	public void paint(Graphics g) {
		g.drawImage(labmag, 0, 0, this);
		g.drawImage(labmag, 0, 150, 200, 100, this);
	}
}
