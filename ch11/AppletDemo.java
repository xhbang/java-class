//AppletDemo.java
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletDemo extends Applet {
	public void paint(Graphics g) {
		super.paint(g);
		// ���û�����ɫΪ��ɫ
		g.setColor(Color.RED);
		// ���ƾ���
		g.drawRect(50, 50, 100, 100);
		// ������
		g.fillRect(200, 50, 100, 100);
		// ���û�����ɫΪ��ɫ
		g.setColor(Color.GREEN);
		// ����Բ��
		g.drawOval(50, 200, 100, 100);
		// ���Բ��
		g.fillOval(200, 200, 100, 100);
	}

	public void init() {
		super.init();
	}

	public void start() {
		super.start();
	}

	public void stop() {
		super.stop();
	}

	public void destroy() {
		super.destroy();
	}
}
