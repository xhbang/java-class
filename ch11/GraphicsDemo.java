//GraphicsDemo.java
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GraphicsDemo extends JFrame {
	public GraphicsDemo() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

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

	public static void main(String[] args) {
		GraphicsDemo myFrame = new GraphicsDemo();
		myFrame.setVisible(true);
	}
}
