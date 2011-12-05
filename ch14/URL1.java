//URL1.java
import java.io.*;
import java.net.*;

public class URL1 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.javajeff.com/articles/articles/html");
		System.out.println("Authority = " + url.getAuthority());
		System.out.println("Default port = " + url.getDefaultPort());
		System.out.println("File = " + url.getFile());
		System.out.println("Host = " + url.getHost());
		System.out.println("Path = " + url.getPath());
		System.out.println("Port = " + url.getPort());
		System.out.println("Protocol = " + url.getProtocol());
		System.out.println("Query = " + url.getQuery());
		System.out.println("Ref = " + url.getRef());
		System.out.println("User Info = " + url.getUserInfo());
	}
}
