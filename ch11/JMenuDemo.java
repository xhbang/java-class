//JMenuDemo.java
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JMenuDemo extends JFrame {
	public JMenuDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		// ����item1��item2
		JMenuItem item1 = new JMenuItem("item1");
		JMenuItem item2 = new JMenuItem("item2");
		// Ϊitem2�����¼�
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����item2");
			}
		});
		// ����menu1
		JMenu menu1 = new JMenu("menu1");
		// ��item1��item2���뵽menu1
		menu1.add(item1);
		menu1.add(item2);
		// ����menu2
		JMenu menu2 = new JMenu("menu2");
		// ����JMenuBar
		JMenuBar menuBar = new JMenuBar();
		// ��menu1��menu2���뵽menuBar
		menuBar.add(menu1);
		menuBar.add(menu2);
		// Ϊ��������JMenuBar
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		JMenuDemo frame = new JMenuDemo();
		frame.setVisible(true);
	}
}
