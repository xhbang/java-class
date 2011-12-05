//WindowClosingDemo.java
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowClosingDemoRedo1 extends JFrame {
	public WindowClosingDemoRedo1() {
		setSize(300, 300);
		setLocation(400, 400);
		// 设置默认关闭操作为:什么也不做
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// 用WindowAdapter添加关闭事件
		addWindowListener(new WindowListener() {
			public void windowClosing(WindowEvent e) {
				// 询问是否关闭窗口
				int answer = JOptionPane.showConfirmDialog(null, "是否关闭窗口？",
						"窗口消息", JOptionPane.YES_NO_OPTION);
				// 如果回答“是”则关闭
				if (answer == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		WindowClosingDemoRedo1 frame = new WindowClosingDemoRedo1();
		frame.setVisible(true);
	}
}
