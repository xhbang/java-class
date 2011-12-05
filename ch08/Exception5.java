// Exception5.java
import java.io.*;

public class Exception5 {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("text.txt");
			int b;
			while ((b = fis.read()) != -1) {
				System.out.print(b);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("message: " + e.getMessage());
			e.printStackTrace(System.out);
		} catch (IOException e) {
			System.out.println(e);
		}

	} // main����
}
