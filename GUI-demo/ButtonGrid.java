import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
public class ButtonGrid {
	public static void main(String args[]) {
		Frame f = new Frame("GridLayout");
		f.setLayout(new GridLayout(3,2)); 
		f.add(new Button("1")); //��ӵ���һ�еĵ�һ��
		f.add(new Button("2")); //��ӵ���һ�е���һ��
		f.add(new Button("3")); //��ӵ��ڶ��еĵ�һ��
		f.add(new Button("4")); //��ӵ��ڶ��е���һ��
		f.add(new Button("5")); //��ӵ������еĵ�һ��
		f.add(new Button("6")); //��ӵ������е���һ��
		f.setSize(200,200);
		f.setVisible(true);
		}
	}