import java.io.*;

class SenderThread extends Thread
{
	PipedWriter pipedWriter;

	public SenderThread()
	{
		pipedWriter = new PipedWriter();
	}

	public PipedWriter getPipedWriter()
	{
		return pipedWriter;
	}

	public void run()
	{
		for (int i = 0; i < 5; i++) {
			try {
				pipedWriter.write(i);
			} catch (IOException e) {
			}
			System.out.println("Send: " + i);
		}
	}
}

class ReceiverThread extends Thread
{
	PipedReader pipedReader;

	public ReceiverThread(SenderThread senderThread) throws IOException
	{
		pipedReader = new PipedReader(senderThread.getPipedWriter());
	}

	public void run()
	{
		int i = 0;
		while (true) {
			try {
				i = pipedReader.read();
				System.out.println("Received: " + i);
			} catch (IOException e) {
			}
			if (i == 4)
				break;
		}
	}
}

public class ThreadComm
{
	public static void main(String[] args) throws Exception
	{
		SenderThread sender = new SenderThread();
		ReceiverThread receiver = new ReceiverThread(sender);
		sender.start();
		receiver.start();
	}
}
