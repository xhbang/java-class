//JFrameDemo.java
import javax.swing.JFrame;

public class JFrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // JFrameʵ����
		frame.setSize(300, 300); // ���ô����СΪ300x300
		frame.setLocation(400, 400); // ���ô�����ʾλ����(400,400)
		frame.setTitle("JFrameDemo"); // ���ô������ΪJFrameDemo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ùرհ�����Ĭ�ϲ���
		frame.setVisible(true); // ��ʾ����
	}
}
