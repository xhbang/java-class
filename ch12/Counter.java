import java.applet.Applet;
import java.awt.*;

public class Counter extends Applet {
	int Clicks = 0;
	int currentX;
	int currentY;

	public void paint(Graphics g) {
		g.drawString(new Integer(Clicks).toString(), 5, 15);
		g.drawString(new Integer(currentX).toString(), 30, 15);
		g.drawString(new Integer(currentY).toString(), 55, 15);
	}

	public boolean mouseUp(Event evt, int x, int y) {
		Clicks++;
		repaint();
		return true;
	}

	public boolean mouseMove(Event evt, int x, int y) {
		currentX = x;
		currentY = y;
		repaint();
		return true;
	}
}
