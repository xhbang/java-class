import java.applet.*;
import java.awt.*;

public class mouseDown_event extends Applet {
	int cx = 50; // 定义鼠标的初始位置
	int cy = 50;

	public boolean mouseDown(Event e, int x, int y) {
		cx = x; // 重新定义字符串的位置参数，使字符串的显示位置为鼠标按下的位置。
		cy = y;
		repaint(); // 重新绘制屏幕，使字符串位置更新。
		return true; // 返回函数，此函数为真。
	}

	public void paint(Graphics g) {
		g.drawString("在哪儿按鼠标，我就在哪出现!", cx, cy);
	}
}
