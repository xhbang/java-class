import java.applet.*;
import java.awt.*;

public class mouseDown_event extends Applet {
	int cx = 50; // �������ĳ�ʼλ��
	int cy = 50;

	public boolean mouseDown(Event e, int x, int y) {
		cx = x; // ���¶����ַ�����λ�ò�����ʹ�ַ�������ʾλ��Ϊ��갴�µ�λ�á�
		cy = y;
		repaint(); // ���»�����Ļ��ʹ�ַ���λ�ø��¡�
		return true; // ���غ������˺���Ϊ�档
	}

	public void paint(Graphics g) {
		g.drawString("���Ķ�����꣬�Ҿ����ĳ���!", cx, cy);
	}
}
