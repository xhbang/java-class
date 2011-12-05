import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo
{

	public static void main(String[] args)
	{
		boolean b = false;
		int i = 20;
		char c = '中';
		double d = 1.1;
		String s = "中华人民共和国";
		String filename = "example.dat";
		FileOutputStream fout = null;
		FileInputStream fin = null;
		DataInputStream din = null;
		DataOutputStream dout = null;
		try
		{
			fout = new FileOutputStream(filename);
			dout = new DataOutputStream(fout);
			// 把数据写入文件
			dout.writeBoolean(b);
			dout.writeInt(i);
			dout.writeChar(c);
			dout.writeDouble(d);
			dout.writeUTF(s);
			dout.flush();
			dout.close();
			fout.close();
			// 把数据从文件中读出来
			fin = new FileInputStream(filename);
			din = new DataInputStream(fin);
			System.out.println(din.readBoolean());
			System.out.println(din.readInt());
			System.out.println(din.readChar());
			System.out.println(din.readDouble());
			System.out.println(din.readUTF());
		} catch (FileNotFoundException ex)
		{
			System.out.println("文件不存在.");
			System.out.println(ex);
		} catch (IOException ex)
		{
			System.out.println("IO异常.");
			System.out.println(ex);
		}
	}
}
