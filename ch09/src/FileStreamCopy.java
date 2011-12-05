import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopy
{
	public static void main(String[] args) throws IOException
	{
		int size;
		// 构造输入流对象
		FileInputStream f = new FileInputStream("src/FileStreamCopy.java");
		FileOutputStream fout = new FileOutputStream("copy-of-file.txt");
		System.out.println("Total Available Bytes: " + (size = f.available()));
		int n = size / 30;
		System.out.println("First " + n
				+ " bytes of the file one read() at a time");
		// 使用read()和write
		for (int i = 0; i < n; i++)
		{
			fout.write(f.read());
		}
		System.out.println("Still Available: " + f.available());
		System.out.println("Reading the next " + n + " with one read(b[])");
		// 使用read(byte[]b )和write(byte[] b);
		byte b[] = new byte[n];
		if (f.read(b) != n)
		{
			System.err.println("couldn't read " + n + " bytes.");
		}
		fout.write(b);
		System.out.println("Still Available: " + f.available());
		// 使用read(b,offset,len)和write（b,offset,len）
		System.out
				.println("Reading the rest bytes  with  read(b[],offset,len)");
		int count = 0;
		while ((count = f.read(b, 0, n)) != -1)
			fout.write(b, 0, count);
		System.out.println("Still Available: " + f.available());
		f.close();
		fout.flush();
		fout.close();
	}
}
