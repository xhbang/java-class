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
		// 通过类型转换获得Graphics2D的实例
		Graphics2D g2 = (Graphics2D) g;
		// 设置画笔样式
		g2.setStroke(new BasicStroke(4.0f));
		// 用GeneralPath构造一个五角星
		GeneralPath p = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		p.moveTo(-100.0f, -25.0f);
		p.lineTo(+100.0f, -25.0f);
		p.lineTo(-50.0f, +100.0f);
		p.lineTo(+0.0f, -100.0f);
		p.lineTo(+50.0f, +100.0f);
		p.closePath();
		// 将坐标平移到（200,200）
		g2.translate(200.0f, 200.0f);
		// 绘制五角星，p是保存了五角星的GeneralPath对象
		g2.draw(p);
	}

	public static void main(String[] args) {
		Graphics2DDemo myFrame = new Graphics2DDemo();
		myFrame.setVisible(true);
	}
}
