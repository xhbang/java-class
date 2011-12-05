//MouseEventDemo.java
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame {
	JLabel label = new JLabel("");

	public MouseEventDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				label.setText("�����" + event.getX() + "," + event.getY()
						+ "�����˵��");
			}
		});
		this.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent event) {
				label.setText("����ƶ�����" + event.getX() + "," + event.getY());
			}
		});
		this.addMouseWheelListener(new MouseAdapter() {
			public void mouseWheelMoved(MouseWheelEvent event) {
				label.setText("�����ֽ����˹���");
			}
		});
		setLayout(new BorderLayout());
		add(label, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		MouseEventDemo frame = new MouseEventDemo();
		frame.setVisible(true);
	}
}