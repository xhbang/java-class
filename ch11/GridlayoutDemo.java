//GridlayoutDemo.java
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridlayoutDemo extends JFrame {
	private JButton button1 = new JButton("First Button");
	private JButton button2 = new JButton("Second Button");
	private JButton button3 = new JButton("Third Button");
	private JButton button4 = new JButton("Fourth Button");

	public GridlayoutDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置布局方式为GridLayout,2行，2列
		setLayout(new GridLayout(2, 2));
		// 添加组件时不需要设置组件所在行、列
		add(button1);
		add(button2);
		add(button3);
		add(button4);
	}

	public static void main(String arg[]) {
		GridlayoutDemo frame = new GridlayoutDemo();
		frame.setVisible(true);
	}
}