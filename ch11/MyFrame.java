//MyFrame.java
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 300); // ���ô����СΪ300x300
		setLocation(400, 400); // ���ô�����ʾλ����(400,400)
		setTitle("MyFrame"); // ���ô������ΪMyFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ùرհ�����Ĭ�ϲ���
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame(); // MyFrameʵ����
		myFrame.setVisible(true); // ��ʾ����
	}
}
