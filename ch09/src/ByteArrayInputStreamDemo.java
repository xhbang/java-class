import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args)
	{

		String tmp = "ABCDEF";
		byte b[] = tmp.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		for (int i = 0; i < 2; i++)
		{
			int c;

			if (i == 0)
			{
				while ((c = in.read()) != -1)
				{
					System.out.print((char) c);
				}
			} else
			{
				while ((c = in.read()) != -1)
				{
					System.out.print(Character.toLowerCase((char) c));
				}

			}
			System.out.println();
			// 第2次for循环从头开始读取流
			in.reset();
		}
	}
}
