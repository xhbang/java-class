//ComplexLayoutDemo.java
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComplexLayoutDemo extends JFrame {
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JPanel panel3 = new JPanel();
	private JPanel panel4 = new JPanel();

	public ComplexLayoutDemo() {
		setSize(500, 500);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��panel1���в���
		layoutPanel1();
		// ��panel2���в���
		layoutPanel2();
		// ��panel3���в���
		layoutPanel3();
		// ��panel4���в���
		layoutPanel4();
		// �Զ����������в���,����GridLayout��2�У�2��
		setLayout(new GridLayout(2, 2));
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
	}

	private void layoutPanel1() {
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton east = new JButton("East");
		JButton west = new JButton("West");
		JButton center = new JButton("Center");
		// panel1����BorderLayout����
		panel1.setLayout(new BorderLayout());
		panel1.add(north, BorderLayout.NORTH);
		panel1.add(south, BorderLayout.SOUTH);
		panel1.add(east, BorderLayout.EAST);
		panel1.add(west, BorderLayout.WEST);
		panel1.add(center, BorderLayout.CENTER);
	}

	private void layoutPanel2() {
		JButton button1 = new JButton("First Button");
		JButton button2 = new JButton("Second Button");
		JButton button3 = new JButton("Third Button");
		JButton button4 = new JButton("Fourth Button");
		// panel2����FlowLayout����
		panel2.setLayout(new FlowLayout());
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
	}

	private void layoutPanel3() {
		JButton button1 = new JButton("First Button");
		JButton button2 = new JButton("Second Button");
		JButton button3 = new JButton("Third Button");
		JButton button4 = new JButton("Fourth Button");
		// panel3����GridLayout���֣�2�У�2��
		panel3.setLayout(new GridLayout(2, 2));
		panel3.add(button1);
		panel3.add(button2);
		panel3.add(button3);
		panel3.add(button4);
	}

	private void layoutPanel4() {
		JButton button = new JButton("JButton");
		;
		JTextField textField = new JTextField("JTextField");
		// panel2�����޲��ֹ���������
		panel4.setLayout(null);
		button.setLocation(20, 20);
		button.setSize(100, 20);
		textField.setBounds(20, 50, 200, 100);
		panel4.add(button);
		panel4.add(textField);
	}

	public static void main(String[] args) {
		ComplexLayoutDemo frame = new ComplexLayoutDemo();
		frame.setVisible(true);
	}
}
