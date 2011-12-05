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
		// 设置画笔颜色为红色
		g.setColor(Color.RED);
		// 绘制矩形
		g.drawRect(50, 50, 100, 100);
		// 填充矩形
		g.fillRect(200, 50, 100, 100);
		// 设置画笔颜色为绿色
		g.setColor(Color.GREEN);
		// 绘制圆形
		g.drawOval(50, 200, 100, 100);
		// 填充圆形
		g.fillOval(200, 200, 100, 100);
	}

	public static void main(String[] args) {
		GraphicsDemo myFrame = new GraphicsDemo();
		myFrame.setVisible(true);
	}
}
