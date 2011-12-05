
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Encoder;

public class AESCryptoString {

	static KeyGenerator kgen;

	static SecretKey skey;

	static SecretKeySpec skeySpec;

	static Cipher cipher;

	public static void main(String[] args) throws Exception {

		String encStr;
		String message = "This is just an example";
		byte[] original;

		//初始化KeyGenerator
		kgen = KeyGenerator.getInstance("AES");
		kgen.init(128); //128, 192 and 256
		// 产生密钥
		skey = kgen.generateKey();
		byte[] raw = skey.getEncoded();
		skeySpec = new SecretKeySpec(raw, "AES");
		System.out.println("format:" + skey.getFormat());
		System.out.println("Algorithm:" + skey.getAlgorithm());
		System.out.println("加密: ");
		// 实例化加密引擎
		cipher = Cipher.getInstance("AES");
		//初始化
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		original = message.getBytes();
		//		加密
		byte[] encrypted = cipher.doFinal(original);
		//用BASE64对字节数组编码
		System.out.println("original bytes : "
				+ new BASE64Encoder().encode(original));
		System.out.println("encrypted string: "
				+ new BASE64Encoder().encode(encrypted));

		//解密
		System.out.println("解密: ");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		original = cipher.doFinal(encrypted);
		String originalString = new String(original);
		System.out.println("Original string: " + originalString);
		System.out.println("original bytes : "
				+ new BASE64Encoder().encode(original));

	}

}