//WindowClosingDemo.java
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowClosingDemo extends JFrame {
	public WindowClosingDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		// 设置默认关闭操作为:什么也不做
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// 用WindowAdapter添加关闭事件
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// 询问是否关闭窗口
				int answer = JOptionPane.showConfirmDialog(null, "是否关闭窗口？",
						"窗口消息", JOptionPane.YES_NO_OPTION);
				// 如果回答“是”则关闭
				if (answer == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}

	public static void main(String[] args) {
		WindowClosingDemo frame = new WindowClosingDemo();
		frame.setVisible(true);
	}
}
