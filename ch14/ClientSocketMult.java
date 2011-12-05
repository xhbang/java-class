// ClientSocketMult.java
import java.io.IOException;
import java.net.InetAddress;

public class ClientSocketMult {
	static final int MAX_THREADS = 40;

	public static void main(String[] args) throws IOException,
			InterruptedException {
		InetAddress addr = InetAddress.getByName(null);
		while (true) {
			if (ClientSocketMultThread.threadCount() < MAX_THREADS)
				new ClientSocketMultThread(addr);
			Thread.sleep(100);
		}
	}
}
