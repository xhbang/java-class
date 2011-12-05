import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
public class ButtonGrid {
	public static void main(String args[]) {
		Frame f = new Frame("GridLayout");
		f.setLayout(new GridLayout(3,2)); 
		f.add(new Button("1")); //添加到第一行的第一格
		f.add(new Button("2")); //添加到第一行的下一格
		f.add(new Button("3")); //添加到第二行的第一格
		f.add(new Button("4")); //添加到第二行的下一格
		f.add(new Button("5")); //添加到第三行的第一格
		f.add(new Button("6")); //添加到第三行的下一格
		f.setSize(200,200);
		f.setVisible(true);
		}
	}