import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String s = "This is a demo progam of ByteArrayOutputStream";
		byte buf[] = s.getBytes();
		f.write(buf);
		System.out.println("Buffer as a string");
		System.out.println(f.toString());
		System.out.println("Into array");
		byte b[] = f.toByteArray();
		for (byte c : b)
		{
			System.out.print((char) c);
		}
		System.out.println("\nTo an OutputStream()");
		FileOutputStream f2 = new FileOutputStream("test.txt");
		// 输出到一个文件
		f.writeTo(f2);
		f2.close();
		System.out.println("ByteArrayOutputStream's size:" + f.size());
		System.out.println("Do reset");
		f.reset();
		for (int i = 0; i < 3; i++)
			f.write('X');
		System.out.println(f.toString());
		System.out.println("ByteArrayOutputStream's size:" + f.size());

	}

}
