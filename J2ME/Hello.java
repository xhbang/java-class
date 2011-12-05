//Ӧ�ó����������ڣ���Java SEһ������java.lang.*��Ĭ�ϼ��ص�
import javax.microedition.midlet.*; //MIDP�û�����
import javax.microedition.lcdui.*;

public class Hello extends MIDlet implements CommandListener {
	private Display display; // ����MIDlet��Display ����
	private TextBox textBox; // Textbox ��ʾһ����Ϣ
	private Command cmdExit; // �趨��ť�����˳�MIDlet

	public Hello() { // MIDlet�������
		display = Display.getDisplay(this);
		cmdExit = new Command("Exit", Command.SCREEN, 1);
		textBox = new TextBox("My First MIDlet", "Hello, Java ME��", 50, 0);
		textBox.addCommand(cmdExit);
		textBox.setCommandListener(this);
	}

	// ����Ҫʵ�ֵĽӿڣ���Ӧ�ù����������������MIDlet
	public void startApp() {
		display.setCurrent(textBox);
	}

	public void pauseApp() {
	} // ����Ҫʵ�ֵĽӿ�

	public void destroyApp(boolean unconditional) {
	} // ����Ҫʵ�ֵĽӿ�
	// ���һ���Ƿ�ѡ�����˳�����

	public void commandAction(Command c, Displayable d) {
		if (c == cmdExit) {
			destroyApp(false);
			notifyDestroyed();
		}
	}
}
