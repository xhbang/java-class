import java.awt.Event;
import java.awt.Graphics;
import java.applet.*;

public class keyDown_event extends Applet {
	char PressKey = 0;
	int Outx = 5, Outy = 15; // �����ʼ�����λ��

	public boolean keyDown(Event e, int key) {
		switch (key) // ȷ�����µļ�ֵ
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
			break; // ���³������Ƽ������������
		}
		repaint();
		return true;
	}

	public void paint(Graphics g) {
		if (PressKey != 0)
			g.drawString("�㰴���ˣ� " + PressKey + "  ��", Outx, Outy);
	}
}
