//JFrameDemo.java
import javax.swing.JFrame;

public class JFrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // JFrame实例化
		frame.setSize(300, 300); // 设置窗体大小为300x300
		frame.setLocation(400, 400); // 设置窗体显示位置在(400,400)
		frame.setTitle("JFrameDemo"); // 设置窗体标题为JFrameDemo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭按键的默认操作
		frame.setVisible(true); // 显示窗体
	}
}
