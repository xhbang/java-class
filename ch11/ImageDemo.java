// ImageDemo.java
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class ImageDemo extends JFrame {
	private Image image = null;

	public ImageDemo() {
		setSize(500, 500);
		setLocation(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			Class clz = this.getClass();
			InputStream stream = clz.getResourceAsStream("images/image.jpg");
			image = ImageIO.read(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, 500, 500, this);
	}

	public static void main(String[] args) {
		ImageDemo frame = new ImageDemo();
		frame.setVisible(true);
	}
}