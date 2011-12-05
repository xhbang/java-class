//FlowLayoutDemo.java
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {
	private JButton button1 = new JButton("First Button");
	private JButton button2 = new JButton("Second Button");
	private JButton button3 = new JButton("Third Button");
	private JButton button4 = new JButton("Fourth Button");

	public FlowLayoutDemo() {
		setSize(300, 150);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ò��ַ�ʽΪFlowLayout
		setLayout(new FlowLayout());
		// ��Ӱ�����ע�����ò��ַ�ʽ֮���κζ�
		// ����������õķ���������setSize��
		// setLocation�ȶ���ʧЧ
		add(button1);
		add(button2);
		add(button3);
		add(button4);
	}

	public static void main(String arg[]) {
		FlowLayoutDemo frame = new FlowLayoutDemo();
		frame.setVisible(true);
	}
}
