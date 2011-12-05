//应用程序生命周期，和Java SE一样，包java.lang.*是默认加载的
import javax.microedition.midlet.*; //MIDP用户界面
import javax.microedition.lcdui.*;

public class Hello extends MIDlet implements CommandListener {
	private Display display; // 引用MIDlet的Display 对象
	private TextBox textBox; // Textbox 显示一条消息
	private Command cmdExit; // 设定按钮用于退出MIDlet

	public Hello() { // MIDlet构造程序
		display = Display.getDisplay(this);
		cmdExit = new Command("Exit", Command.SCREEN, 1);
		textBox = new TextBox("My First MIDlet", "Hello, Java ME！", 50, 0);
		textBox.addCommand(cmdExit);
		textBox.setCommandListener(this);
	}

	// 必须要实现的接口，被应用管理软件调用来启动MIDlet
	public void startApp() {
		display.setCurrent(textBox);
	}

	public void pauseApp() {
	} // 必须要实现的接口

	public void destroyApp(boolean unconditional) {
	} // 必须要实现的接口
	// 检查一下是否选择了退出命令

	public void commandAction(Command c, Displayable d) {
		if (c == cmdExit) {
			destroyApp(false);
			notifyDestroyed();
		}
	}
}
