
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
public class myButtons{ 
	public static void main(String args[]){
		Frame f = new Frame(); 
		f.setLayout(new FlowLayout());
		Button button1 = new Button("Ok");
		Button button2 = new Button("Open");
		Button button3 = new Button("Close");
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.setSize(300,100); 
		f.setVisible(true);
	}
}