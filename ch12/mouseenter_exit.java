import java.awt.*;
import java.applet.*;

public class mouseenter_exit extends Applet {
	String msg = ""; // 定义一条字符串变量，存储要输出的消息。

	public boolean mouseEnter(Event e, int x, int y) {
		msg = "你进来了，真讨厌！拿开！拿开！！把鼠标拿开吧！";
		repaint(); // 重新绘画屏幕
		return true; // 返回真的布尔值
	}

	public boolean mouseExit(Event e, int x, int y) {
		msg = "你把鼠标移开了，别走嘛！为什么不把鼠标移进来呀？";
		repaint();
		return true;
	}

	public void paint(Graphics g) {
		g.drawString(msg, 4, 20); // 显示消息
	}
}
