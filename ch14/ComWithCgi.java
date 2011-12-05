//ComWithCgi.java
import java.io.*;
import java.net.*;

public class ComWithCgi {
	public static void main(String[] args) throws Exception {
		String stringToReverse = URLEncoder.encode("ÖÐ¹ú", "gbk");
//		System.out.println(stringToReverse);

		URL url = new URL("http://localhost:8080/ttt/t1");
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);

		OutputStreamWriter out = new OutputStreamWriter(
	                              connection.getOutputStream());
		out.write("string=" + stringToReverse);
		out.close();

		BufferedReader in = new BufferedReader(
					new InputStreamReader(
					connection.getInputStream()));
					
		String decodedString;

		while ((decodedString = in.readLine()) != null) {
		    System.out.println(decodedString);
		}
		in.close();
	}
}
