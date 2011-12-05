
import java.security.*;
import java.io.*;
import sun.misc.*;

public class MD5 {
	public static void main(String args[]) {
		byte[] b;
		try {
			if (args.length != 1) {
				System.out.println("用法: java 数据 ");
				System.exit(1);
			}
			// 创建文件输出流
			FileOutputStream digestStream = new FileOutputStream("digest.md5");
			// 使用MD5算法，也可以使用SHA算法
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte buf[] = args[0].getBytes();
			// 更新缓冲区数据，使用digest()产生摘要
			md.update(buf);
			b = md.digest();
			//使用BASE64编码把字节数组转化为字符串,便于察看
			BASE64Encoder enc = new BASE64Encoder();
			String s = enc.encode(b);
			System.out.println("BASE64编码后的摘要:" + s);
			System.out.println("摘要位数:" + b.length * 8);
			digestStream.write(b);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}