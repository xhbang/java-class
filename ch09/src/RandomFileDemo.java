import java.io.*;

public class RandomFileDemo
{
	public static void main(String args[])
	{
		String filename = "raf.txt";
		RandomAccessFile raf = null;
		String str1 = "this is a file.";
		String str3 = "中华人民共和国";
		long length;
		long pos;
		try
		{
			// 构建对象
			raf = new RandomAccessFile(filename, "rw");
			raf.writeChars(str1);
			pos = raf.getFilePointer();
			length = str1.length();
			System.out.println("第一个字符串的长度：" + length);
			// 一个字符用两个字节表示,内存中的表示和文件中的表示一致
			System.out.println("写入第一个字符串后，文件指针：" + pos);
			// 又写入一串字符,重置指针位置,读取字符
			System.out.println("第2个字符串:");
			pos = raf.getFilePointer();
			// 写入字符串
			raf.writeChars(str3);
			// 重置指针
			raf.seek(pos);
			for (int i = 0; i < str3.length(); i++)
			{
				System.out.print(raf.readChar());
			}
			pos = raf.getFilePointer();
			System.out.println("\n写入" + str3.length()
					+ "字符后, 文件指针：" + pos);
			System.out.println("文件测试成功。");
		} catch (FileNotFoundException ex)
		{
			System.out.println("文件不存在。");
		} catch (IOException ex)
		{
		}
	}
}