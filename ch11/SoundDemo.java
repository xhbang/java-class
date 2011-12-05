//SoundDemo.java
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundDemo extends JFrame {
	private JButton button = new JButton("暂停");
	private Clip clip;

	public SoundDemo() {
		setSize(300, 300);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			InputStream stream = new FileInputStream("sounds/music.wav");
			AudioInputStream audioStream = AudioSystem
					.getAudioInputStream(stream);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (button.getText().equals("暂停")) {
					clip.stop();
					button.setText("重新开始");
				} else {
					clip.start();
					button.setText("暂停");
				}
			}

		});
		setLayout(new FlowLayout());
		add(button);
	}

	public static void main(String[] args) {
		SoundDemo frame = new SoundDemo();
		frame.setVisible(true);
	}
}