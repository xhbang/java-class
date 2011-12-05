import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamToReaderWriter
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("src/StreamToReaderWriter.java");
		FileInputStream fin = new FileInputStream(file);
		FileOutputStream fout = new FileOutputStream("copy-of-file.txt");
		// �ֽ������ַ���ת��
		InputStreamReader isr = new InputStreamReader(fin, "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(fout, "GBK");
		System.out.println("Current charset of Reader   is :"
				+ isr.getEncoding());
		System.out.println("Current charset of Writer   is :"
				+ osw.getEncoding());
		int n = (int) (file.length() / 30);
		System.out.println("First " + n
				+ " char of the file one read() at a time");
		// ʹ��read()��write
		for (int i = 0; i < n; i++)
		{
			osw.write(isr.read());
		}
		System.out.println("Reading the next " + n + " with one read(b[])");
		// ʹ��read(char[]b )��write(char[] b);
		char b[] = new char[n];
		if (isr.read(b) != n)
		{
			System.err.println("couldn't read " + n + " bytes.");
		}
		osw.write(b);
		// ʹ��read(b,offset,len)��write��b,offset,len��
		System.out
				.println("Reading the rest chars  with  read(b[],offset,len)");
		int count = 0;
		while ((count = isr.read(b, 0, n)) != -1)
			osw.write(b, 0, count);
		isr.close();
		fin.close();
		osw.flush();
		osw.close();
		fout.flush();
		fout.close();
	}
}
