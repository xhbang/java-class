//WindowClosingDemo.java
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowClosingDemo extends JFrame {
	public WindowClosingDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		// ����Ĭ�Ϲرղ���Ϊ:ʲôҲ����
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// ��WindowAdapter��ӹر��¼�
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// ѯ���Ƿ�رմ���
				int answer = JOptionPane.showConfirmDialog(null, "�Ƿ�رմ��ڣ�",
						"������Ϣ", JOptionPane.YES_NO_OPTION);
				// ����ش��ǡ���ر�
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
