import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PushbackInputStream;

public class PushBackDemo
{
	public static void main(String[] args)
	{
		String srcfile = "src/PushBackDemo.java";
		String dest = "PushBackDemo.txt";
		int idNum = 0;
		try
		{
			FileInputStream fis = new FileInputStream(srcfile);
			PushbackInputStream pis = new PushbackInputStream(fis);
			FileOutputStream fout = new FileOutputStream(dest);
			PrintStream ps = new PrintStream(fout);
			int data;
			do
			{
				data = pis.read();
			} while (data != -1 && !Character.isLetter((char) data));
			pis.unread(data);
			while ((data = pis.read()) != -1)
			{
				if (Character.isLetterOrDigit((char) data))
				{
					ps.print((char) data);
				} else
				{
					idNum++;
					ps.println();
					do
					{
						data = pis.read();
					} while (data != -1 && !Character.isLetter((char) data));
					pis.unread(data);
				}
			}
			System.out.println("founded:" + idNum + " words");
		} catch (FileNotFoundException ex)
		{
			System.out.println(ex);
		} catch (IOException ex)
		{
			System.out.println(ex);
		}

	}

}
