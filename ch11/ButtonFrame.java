//ButtonFrame.java
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonFrame extends JFrame {
	private JButton button = new JButton("按键");

	public ButtonFrame() {
		setSize(300, 300);
		setLocation(400, 400);
		setTitle("ButtonFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout()); // 设置布局
		add(button); // 添加按键
	}

	public static void main(String[] args) {
		ButtonFrame frame = new ButtonFrame();
		frame.setVisible(true);
	}
}
