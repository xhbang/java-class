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
		// 创建item1和item2
		JMenuItem item1 = new JMenuItem("item1");
		JMenuItem item2 = new JMenuItem("item2");
		// 为item2设置事件
		item2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "点击了item2");
			}
		});
		// 创建menu1
		JMenu menu1 = new JMenu("menu1");
		// 将item1和item2加入到menu1
		menu1.add(item1);
		menu1.add(item2);
		// 创建menu2
		JMenu menu2 = new JMenu("menu2");
		// 创建JMenuBar
		JMenuBar menuBar = new JMenuBar();
		// 将menu1和menu2加入到menuBar
		menuBar.add(menu1);
		menuBar.add(menu2);
		// 为窗体设置JMenuBar
		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		JMenuDemo frame = new JMenuDemo();
		frame.setVisible(true);
	}
}
