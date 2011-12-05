
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TestCardLayout extends WindowAdapter implements ActionListener{
  private Frame frame;
  private CardLayout cardLayout;
  public void run() {
    frame = new Frame("Test Card Layout");
    frame.setSize(150,120);
    frame.addWindowListener(this);
    Button button1 = new Button("卡片 1");
    Button button2 = new Button("卡片 2");
    Button button3 = new Button("卡片 3");
    Panel panel1 = new Panel();
    Panel panel2 = new Panel();
    Panel panel3 = new Panel();
    panel1.add(button1);
    button1.addActionListener(this);
    panel2.add(button2);
    button2.addActionListener(this);
    panel3.add(button3);
    button3.addActionListener(this);
    cardLayout = new CardLayout();
    frame.setLayout(cardLayout);
    frame.add(panel1,"第一张");
    frame.add(panel2,"第二张");
    frame.add(panel3,"第三张");
    frame.setVisible(true);
  }
  public  void windowClosing( WindowEvent e){
	   System.exit(0);
	  }
	  public void actionPerformed(ActionEvent e){
	    cardLayout.next(frame);
	  }
	  public static void main(String[] args) {
	    TestCardLayout myCardLayout = new TestCardLayout();
	    myCardLayout.run();
	  }
	}

