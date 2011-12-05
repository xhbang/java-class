//URL2.java
import java.io.*;
import java.net.*;

public class URL2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.cqu.edu.cn/html/index.htm");
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		String s;
		while ((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
	}
}
