import java.awt.*;
import java.applet.*;

public class mouseenter_exit extends Applet {
	String msg = ""; // ����һ���ַ����������洢Ҫ�������Ϣ��

	public boolean mouseEnter(Event e, int x, int y) {
		msg = "������ˣ������ᣡ�ÿ����ÿ�����������ÿ��ɣ�";
		repaint(); // ���»滭��Ļ
		return true; // ������Ĳ���ֵ
	}

	public boolean mouseExit(Event e, int x, int y) {
		msg = "�������ƿ��ˣ������Ϊʲô��������ƽ���ѽ��";
		repaint();
		return true;
	}

	public void paint(Graphics g) {
		g.drawString(msg, 4, 20); // ��ʾ��Ϣ
	}
}
