
import java.awt.Color;
import java.awt.Frame;
public class MyFrame extends Frame{
	public static void main(String args[ ]){
		MyFrame fr = new MyFrame("Hello Out There!");
		fr.setSize(200,200);
		fr.setBackground(Color.red); 
		fr.setVisible(true);
	}
		public MyFrame (String str){
			super(str);
		}
}
