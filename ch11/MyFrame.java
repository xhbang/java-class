//MyFrame.java
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 300); // 设置窗体大小为300x300
		setLocation(400, 400); // 设置窗体显示位置在(400,400)
		setTitle("MyFrame"); // 设置窗体标题为MyFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭按键的默认操作
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame(); // MyFrame实例化
		myFrame.setVisible(true); // 显示窗体
	}
}
