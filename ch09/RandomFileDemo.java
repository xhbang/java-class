import java.io.*;

public class RandomFileDemo
{
	public static void main(String args[])
	{
		String filename = "raf.txt";
		RandomAccessFile raf = null;
		String str1 = "this is a file.";
		String str3 = "�л����񹲺͹�";
		long length;
		long pos;
		try
		{
			// ��������
			raf = new RandomAccessFile(filename, "rw");
			raf.writeChars(str1);
			pos = raf.getFilePointer();
			length = str1.length();
			System.out.println("��һ���ַ����ĳ��ȣ�" + length);
			// һ���ַ��������ֽڱ�ʾ,�ڴ��еı�ʾ���ļ��еı�ʾһ��
			System.out.println("д���һ���ַ������ļ�ָ�룺" + pos);
			// ��д��һ���ַ�,����ָ��λ��,��ȡ�ַ�
			System.out.println("��2���ַ���:");
			pos = raf.getFilePointer();
			// д���ַ���
			raf.writeChars(str3);
			// ����ָ��
			raf.seek(pos);
			for (int i = 0; i < str3.length(); i++)
			{
				System.out.print(raf.readChar());
			}
			pos = raf.getFilePointer();
			System.out.println("\nд��" + str3.length()
					+ "�ַ���, �ļ�ָ�룺" + pos);
			System.out.println("�ļ����Գɹ���");
		} catch (FileNotFoundException ex)
		{
			System.out.println("�ļ������ڡ�");
		} catch (IOException ex)
		{
		}
	}
}