// EventDemo.java
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class H1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ȡ������İ���
		JButton clickedButton = (JButton) e.getSource();
		// �ı䱻��������ı���
		clickedButton.setText("I have been pressed");
		
	}
}

public class EventDemoRedo1 extends JFrame {
	JButton button = new JButton("press me");

	public EventDemoRedo1() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ð����¼���ʹ����������
		button.addActionListener(new H1());
		setLayout(new BorderLayout());
		add(button, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		EventDemoRedo1 frame = new EventDemoRedo1();
		frame.setVisible(true);
	}
}
