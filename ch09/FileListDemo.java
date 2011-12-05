import java.io.File;

public class FileListDemo
{

	public static void main(String[] args)
	{

		String dirname = "E:/My documents/Java File";
		File f1 = new File(dirname);
		if (f1.isDirectory())
		{
			System.out.println("Directory of " + dirname);
			File s[] = f1.listFiles();
			for (int i = 0; i < s.length; i++)
			{
				if (s[i].isDirectory())
				{
					System.out.println(s[i] + " is a directory");
				} else
				{
					System.out.println(s[i] + " is a file");
				}
			}
		} else
		{
			System.out.println(dirname + " is not a directory");
		}
	}

}
