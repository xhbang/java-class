
import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.*;

public class WriteFile extends Applet {
	String myFile = "/tmp/foo";

	File f = new File(myFile);

	DataOutputStream dos;

	public void init() {

		String osname = System.getProperty("os.name");
		if (osname.indexOf("Windows") != -1) {
			myFile = "C:" + File.separator + "tmpfoo";
		}
	}

	public void paint(Graphics g) {
		try {
			dos = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(myFile), 128));
			dos.writeBytes("hello world\n");
			dos.flush();
			dos.close();
			g.drawString("Successfully wrote to the file named " + myFile
					+ " -- take a look at it!", 10, 10);
		}

		catch (SecurityException e) {
			g.drawString("writeFile: caught security exception", 10, 10);
		} catch (IOException ioe) {
			g.drawString("writeFile: caught i/o exception", 10, 10);
		}
	}

	public static void main(String args[]) {
		Frame f = new Frame("writeFile");
		WriteFile writefile = new WriteFile();

		writefile.init();
		writefile.start();

		f.add("Center", writefile);
		f.setSize(400, 100);
		f.setVisible(true);
	}
}