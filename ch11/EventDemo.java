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
		// ���ð����¼���ʹ����������
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ȡ������İ���
				JButton clickedButton = (JButton) e.getSource();
				// �ı䱻��������ı���
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
