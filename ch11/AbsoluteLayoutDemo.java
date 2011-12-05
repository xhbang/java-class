//AbsoluteLayoutFrame.java
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AbsoluteLayoutDemo extends JFrame {
	private JButton button = new JButton("JButton");;
	private JTextField textField = new JTextField("JTextField");

	public AbsoluteLayoutDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ò��ֹ���Ϊnull
		setLayout(null);
		// ���ð�����λ��Ϊ(20,20)����100����20
		button.setLocation(20, 20);
		button.setSize(100, 20);
		add(button);
		// ����������λ��Ϊ(20,50)����200����100
		textField.setBounds(20, 50, 200, 100);
		add(textField);
	}

	public static void main(String[] args) {
		AbsoluteLayoutDemo frame = new AbsoluteLayoutDemo();
		frame.setVisible(true);
	}
}
