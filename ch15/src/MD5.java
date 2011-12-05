
import java.security.*;
import java.io.*;
import sun.misc.*;

public class MD5 {
	public static void main(String args[]) {
		byte[] b;
		try {
			if (args.length != 1) {
				System.out.println("�÷�: java ���� ");
				System.exit(1);
			}
			// �����ļ������
			FileOutputStream digestStream = new FileOutputStream("digest.md5");
			// ʹ��MD5�㷨��Ҳ����ʹ��SHA�㷨
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte buf[] = args[0].getBytes();
			// ���»��������ݣ�ʹ��digest()����ժҪ
			md.update(buf);
			b = md.digest();
			//ʹ��BASE64������ֽ�����ת��Ϊ�ַ���,���ڲ쿴
			BASE64Encoder enc = new BASE64Encoder();
			String s = enc.encode(b);
			System.out.println("BASE64������ժҪ:" + s);
			System.out.println("ժҪλ��:" + b.length * 8);
			digestStream.write(b);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}