import java.awt.Event;
import java.awt.Graphics;
import java.applet.*;

public class keyDown_event extends Applet {
	char PressKey = 0;
	int Outx = 5, Outy = 15; // 定义初始的输出位置

	public boolean keyDown(Event e, int key) {
		switch (key) // 确定按下的键值
		{
		case Event.UP:
			Outy--;
			break;
		case Event.DOWN:
			Outy++;
			break;
		case Event.LEFT:
			Outx--;
			break;
		case Event.RIGHT:
			Outx++;
			break;
		case Event.HOME:
			Outx = 5;
			Outy = 15;
			break;
		case Event.END:
			Outx = 5;
			Outy = size().height - 15;
			break;
		case Event.PGUP:
			Outy -= 5;
			break;
		case Event.PGDN:
			Outy += 15;
			break;
		default:
			PressKey = (char) key;
			break; // 按下除开控制键以外的其他键
		}
		repaint();
		return true;
	}

	public void paint(Graphics g) {
		if (PressKey != 0)
			g.drawString("你按下了： " + PressKey + "  键", Outx, Outy);
	}
}
