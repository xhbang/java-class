// UDP_socket_server.java
import java.net.*;
import java.io.*;
import java.util.*;

public class UDP_socket_server {
	static final int INPORT = 1711;
	private byte[] buf = new byte[1000];
	private DatagramPacket dp = new DatagramPacket(buf, buf.length);
	private DatagramSocket socket;

	public UDP_socket_server() {
		try {
			socket = new DatagramSocket(INPORT);
			System.out.println("Server started");
			while (true) {
				socket.receive(dp);
				String rcvd = DataGram.toString(dp) + ", from address: "
						+ dp.getAddress() + ", port: " + dp.getPort();
				System.out.println(rcvd);
				String echoString = "Echoed: " + rcvd;
				DatagramPacket echo = DataGram.toDatagram(echoString, dp
						.getAddress(), dp.getPort());
				socket.send(echo);
			}
		} catch (SocketException e) {
			System.err.println("Can't open socket");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Communication error");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UDP_socket_server();
	}
}
