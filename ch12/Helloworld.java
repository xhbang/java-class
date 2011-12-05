import java.awt.*;
import java.applet.*;

public class Helloworld extends Applet {
	private String title;
	private int size;
	private int color;

	public void init() {
		title = "Hello World!";
		size = Integer.parseInt(getParameter("size")); // ��������С
		color = Integer.parseInt(getParameter("color")); // ���������ɫ
	}

	public void paint(Graphics g) {
		Color c = new Color(color);
		g.setColor(c);
		Font f = new Font("", 1, size);
		g.setFont(f);
		g.drawString(title, 100, 80);
	}
}