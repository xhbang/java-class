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
		// �ӿ���̨�����ַ���
		ir = new InputStreamReader(System.in);
		br = new BufferedReader(ir);
		System.out.println("��������:");
		s = br.readLine();
		System.out.println("����ֵ�ǣ�" + s);
		if (s != null)
			i = Integer.parseInt(s);// ת��������.
		i *= 2;
		System.out.println("����ֵ��2��:" + i);
	}

}
