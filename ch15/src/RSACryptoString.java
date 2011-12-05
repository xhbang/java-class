
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;

import javax.crypto.Cipher;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

//从KeyStore和证书文件中 分别获取私钥和公钥，进行签名和 验证。
//使用了第三方的Provider实现了加密和解密

public class RSACryptoString {
	static BASE64Encoder enc = new BASE64Encoder();

	static BASE64Decoder dec = new BASE64Decoder();

	static PublicKey pubKey;

	static PrivateKey priKey;

	public static void main(String[] args) {
		String message = "This is just an example";
		byte[] original;

		try {

			//得到密钥对产生器对象,生成密钥
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
			random.setSeed(12345678);
			keyGen.initialize(1024, random);
			KeyPair pair = keyGen.generateKeyPair();

			//得到公钥和私钥
			PrivateKey priv = pair.getPrivate();
			PublicKey pub = pair.getPublic();

			//得到加密引擎对象
			Cipher cipher = Cipher.getInstance("RSA", "SunJCE");
			System.out.println("Original string: " + message);

			//用公钥加密
			System.out.println("加密:");
			cipher.init(Cipher.ENCRYPT_MODE, pub);
			original = message.getBytes();
			byte[] encrypted = cipher.doFinal(original);
			//加密后的Base64编码
			System.out.println("加密后的数据:" + enc.encode(encrypted));
			// 用私钥解密
			System.out.println("解密:");
			cipher.init(Cipher.DECRYPT_MODE, priv);
			original = cipher.doFinal(encrypted);
			String originalString = new String(original);
			System.out.println("Original string: " + originalString);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}