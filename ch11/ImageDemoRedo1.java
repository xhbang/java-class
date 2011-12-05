// ImageDemo.java
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class ImageDemoRedo1 extends JFrame {
	private Image image = null;

	public ImageDemoRedo1() {
		setSize(500, 500);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			File img = new File("D:/Java/workspace/ch11_GUI≥Ã–Ú…Ëº∆/src/images/image.jpg");
//			InputStream stream = clz.getResourceAsStream("images/image.jpg");
			image = ImageIO.read(img);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, 500, 500, this);
	}

	public static void main(String[] args) {
		ImageDemoRedo1 frame = new ImageDemoRedo1();
		frame.setVisible(true);
	}
}