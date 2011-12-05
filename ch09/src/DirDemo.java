import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class DirDemo
{
	public static void main(String[] args)
	{
		File dir = new File("E:/My documents/Java File");
		System.out.println("�г�Ŀ¼" + dir + "�е�class�ļ�");
		Filter filter = new Filter("class");
		File fs1[] = dir.listFiles(filter);
		display(fs1);
		System.out.println("�г�Ŀ¼" + dir + "�е���Ŀ¼");
		DirFilter filter2 = new DirFilter();
		File fs2[] = dir.listFiles(filter2);
		display(fs2);
		//�ڴ���һ����Ŀ¼
		File f=new File(fs2[0].getPath()+"_newDir");
		System.out.println(f.mkdir());
		File fs3[] = dir.listFiles(filter2);
		display(fs3);
	}

	public static void display(File[] fs)
	{
		for (int i = 0; i < fs.length; i++)
		{
			if (fs[i].isDirectory())
				System.out.println("Ŀ¼:" + fs[i]);
			else
				System.out.println("�ļ�:" + fs[i]);
		}
	}
}

// ������չ��������
class Filter implements FilenameFilter
{
	String extent;

	Filter(String extent)
	{
		this.extent = extent;
	}

	public boolean accept(File dir, String name)
	{
		return name.endsWith("." + extent);
	}
}

// ����Ŀ¼������
class DirFilter implements FileFilter
{
	public boolean accept(File path)
	{
		return path.isDirectory();
	}
}
