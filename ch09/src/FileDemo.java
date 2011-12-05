import java.io.File;
import java.io.IOException;

public class FileDemo
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("path separator：    " + File.pathSeparator);
		System.out.println("path separator char:" + File.pathSeparatorChar);
		System.out.println("separator:          " + File.separator);
		System.out.println("separator char:     " + File.separatorChar);
		File dir = new File("E:/My documents/Java File");
		File f = new File(dir, "FileDemo.class");
		File path = new File("E:/My documents/Java File/FileDemo.class");
		// 使用uri构造File对象
		File f2 = new File("file:/E:/My%20documents/Java%20File/FileDemo.class");
		System.out.println("");
		System.out.println(f);
		System.out.println("exist:              " + f.exists());
		System.out.println("name:               " + f.getName());
		System.out.println("path:               " + f.getPath());
		System.out.println("abosolute path:     " + f.getAbsolutePath());
		System.out.println("parent:             " + f.getParent());
		System.out.println("is a file :         " + f.isFile());
		System.out.println("is a directory:     " + f.isDirectory());
		System.out.println("length:             " + f.length());
		System.out.println("can read:           " + f.canRead());
		System.out.println("can write :         " + f.canWrite());
		System.out.println("last modified:      " + f.lastModified());
		f.setLastModified(f.lastModified() + 1102304);
		System.out.println("last modified:      " + f.lastModified());
		System.out.println("Canonical Path:" + f.getCanonicalPath());
		File newF = new File("newFile.class");
		System.out.println("-----Rename " + f + "-------");
		f.renameTo(newF);
		System.out.println("name :             " + newF.getName());
		System.out.println(f + " exist?           " + f.exists());
		System.out.println(newF + " exist?           " + f.exists());
		System.out.println("convert to URI:" + f.toURI());
		System.out.println("compare f to path:" + f.compareTo(path));
		System.out.println("compare f to f2:" + f.compareTo(f2));
		System.out.println("-----delete " + newF + "-------");
		newF.delete();
		System.out.println(newF + " exist? " + newF.exists());
	}

}
