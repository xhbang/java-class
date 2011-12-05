// ScannerPrintWriterDemo.java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class  T1 {
	public static void main(String[] args) {
		Scanner s = null;
		PrintWriter pw = null;
		try {
	// 从源文件输入，使用Scanner读入由空白字符分割的文本文件内容是很方便的
			s = new Scanner(new File("source.txt"));
			// 使用PrintWriter进行格式化输出
			pw = new PrintWriter("dest.txt");
			while (s.hasNextLine()) {
				String strLine = s.nextLine();
				// 调用方法求每一行的和
				int sum = getLineSum(strLine);
				// 输出每一行
				pw.println(strLine + "\t" + sum);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {// 关闭输入流和输出流
			if (s != null)
				s.close();
			if (pw != null)
				pw.close();
		}
	}
	// 计算每一行的和的方法
	private static int getLineSum(String strLine) {
		// 使用Scanner分割每一行为多个整数
		Scanner s = new Scanner(strLine);
		int sum = 0;
		while (s.hasNextInt()) {
			sum += s.nextInt();
		}
		return sum;
	}
}
