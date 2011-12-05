// EventDemo.java
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo extends JFrame {
	JButton button = new JButton("press me");

	public EventDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置按键事件，使用了匿名类
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 获取被点击的按键
				JButton clickedButton = (JButton) e.getSource();
				// 改变被点击按键的标题
				clickedButton.setText("I have been pressed");
			}
		});
		setLayout(new BorderLayout());
		add(button, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		EventDemo frame = new EventDemo();
		frame.setVisible(true);
	}
}
