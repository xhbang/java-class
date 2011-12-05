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
	// ��Դ�ļ����룬ʹ��Scanner�����ɿհ��ַ��ָ���ı��ļ������Ǻܷ����
			s = new Scanner(new File("source.txt"));
			// ʹ��PrintWriter���и�ʽ�����
			pw = new PrintWriter("dest.txt");
			while (s.hasNextLine()) {
				String strLine = s.nextLine();
				// ���÷�����ÿһ�еĺ�
				int sum = getLineSum(strLine);
				// ���ÿһ��
				pw.println(strLine + "\t" + sum);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {// �ر��������������
			if (s != null)
				s.close();
			if (pw != null)
				pw.close();
		}
	}
	// ����ÿһ�еĺ͵ķ���
	private static int getLineSum(String strLine) {
		// ʹ��Scanner�ָ�ÿһ��Ϊ�������
		Scanner s = new Scanner(strLine);
		int sum = 0;
		while (s.hasNextInt()) {
			sum += s.nextInt();
		}
		return sum;
	}
}
