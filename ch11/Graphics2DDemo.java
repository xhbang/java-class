//Graphics2DDemo.java
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;

public class Graphics2DDemo extends JFrame {
	public Graphics2DDemo() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		super.paint(g);
		// ͨ������ת�����Graphics2D��ʵ��
		Graphics2D g2 = (Graphics2D) g;
		// ���û�����ʽ
		g2.setStroke(new BasicStroke(4.0f));
		// ��GeneralPath����һ�������
		GeneralPath p = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		p.moveTo(-100.0f, -25.0f);
		p.lineTo(+100.0f, -25.0f);
		p.lineTo(-50.0f, +100.0f);
		p.lineTo(+0.0f, -100.0f);
		p.lineTo(+50.0f, +100.0f);
		p.closePath();
		// ������ƽ�Ƶ���200,200��
		g2.translate(200.0f, 200.0f);
		// ��������ǣ�p�Ǳ���������ǵ�GeneralPath����
		g2.draw(p);
	}

	public static void main(String[] args) {
		Graphics2DDemo myFrame = new Graphics2DDemo();
		myFrame.setVisible(true);
	}
}
