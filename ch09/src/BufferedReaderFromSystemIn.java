import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderFromSystemIn
{

	public static void main(String[] args) throws IOException
	{
		String s;
		InputStreamReader ir;
		BufferedReader br;
		int i = 0;
		// 从控制台构造字符流
		ir = new InputStreamReader(System.in);
		br = new BufferedReader(ir);
		System.out.println("输入数字:");
		s = br.readLine();
		System.out.println("输入值是：" + s);
		if (s != null)
			i = Integer.parseInt(s);// 转换成整数.
		i *= 2;
		System.out.println("输入值＊2是:" + i);
	}

}
