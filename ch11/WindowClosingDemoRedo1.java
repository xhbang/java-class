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
		// ����Ĭ�Ϲرղ���Ϊ:ʲôҲ����
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// ��WindowAdapter��ӹر��¼�
		addWindowListener(new WindowListener() {
			public void windowClosing(WindowEvent e) {
				// ѯ���Ƿ�رմ���
				int answer = JOptionPane.showConfirmDialog(null, "�Ƿ�رմ��ڣ�",
						"������Ϣ", JOptionPane.YES_NO_OPTION);
				// ����ش��ǡ���ر�
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
