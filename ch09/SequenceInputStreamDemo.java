import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.*;

public class SequenceInputStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		int c;
		ArrayList<InputStream> al = new ArrayList<InputStream>();
		al.add(new FileInputStream("src/SequenceInputStreamDemo.java"));
		al.add(new FileInputStream("src/FileDemo.java"));
		Enumeration<InputStream> e = Collections.enumeration(al);
		SequenceInputStream input = new SequenceInputStream(e);
		while ((c = input.read()) != -1)
		{
			System.out.print((char) c);
		}
		input.close();

	}

}
