// UDP_socket_client
import java.lang.Thread;
import java.net.*;
import java.io.*;

public class UDP_socket_client extends Thread {
	private DatagramSocket s;
	private InetAddress hostAddress;
	private byte[] buf = new byte[1000];
	private DatagramPacket dp = new DatagramPacket(buf, buf.length);
	private int id;

	public UDP_socket_client(int identifier) {
		id = identifier;
		try {
			s = new DatagramSocket();
			hostAddress = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			System.err.println("Cannot find host");
			System.exit(1);
		} catch (SocketException e) {
			System.err.println("Can't open socket");
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("UDP_socket_client "+id+" starting");
	}

	public void run() {
		try {
			for (int i = 0; i < 25; i++) {
				String outMessage = "Client #" + id + ", message #" + i;
				s.send(DataGram.toDatagram(outMessage, hostAddress,
						UDP_socket_server.INPORT));
				s.receive(dp);
				String rcvd = "Client #" + id + ", rcvd from "
						+ dp.getAddress() + ", " + dp.getPort() + ": "
						+ DataGram.toString(dp);
				System.out.println(rcvd);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new UDP_socket_client(i).start();
	}
}
