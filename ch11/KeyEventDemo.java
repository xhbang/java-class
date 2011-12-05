// KeyEventDemo.java
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventDemo extends JFrame {
	JLabel label = new JLabel("�����˰�����");

	public KeyEventDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event) {
				switch (event.getKeyCode()) {
				case KeyEvent.VK_UP:
					label.setText("�����˰�����UP");
					break;
				case KeyEvent.VK_DOWN:
					label.setText("�����˰�����DOWN");
					break;
				case KeyEvent.VK_LEFT:
					label.setText("�����˰�����LEFT");
					break;
				case KeyEvent.VK_RIGHT:
					label.setText("�����˰�����RIGHT");
					break;
				default:
					label.setText("�����˰�����UP");
				}
			}
		});
		setLayout(new BorderLayout());
		add(label, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		KeyEventDemo frame = new KeyEventDemo();
		frame.setVisible(true);
	}
}