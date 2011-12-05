import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		// 构造输入流对象
		File file = new File("src/FileReaderWriterDemo.java");
		FileReader f = new FileReader(file);
		FileWriter fout = new FileWriter("copy-of-file.txt");
		System.out.println("Current charset is :" + f.getEncoding());
		int n = (int) (file.length() / 30);
		System.out.println("First " + n
				+ " char of the file one read() at a time");
		// 使用read()和write
		for (int i = 0; i < n; i++)
		{
			fout.write(f.read());

		}
		System.out.println("Reading the next " + n + " with one read(b[])");
		// 使用read(char[]b )和write(char[] b);
		char b[] = new char[n];
		if (f.read(b) != n)
		{
			System.err.println("couldn't read " + n + " bytes.");
		}
		fout.write(b);
		// 使用read(b,offset,len)和write（b,offset,len）
		System.out
				.println("Reading the rest chars  with  read(b[],offset,len)");
		int count = 0;
		while ((count = f.read(b, 0, n)) != -1)
			fout.write(b, 0, count);
		f.close();
		fout.flush();
		fout.close();
	}

}
