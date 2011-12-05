
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;

import javax.crypto.Cipher;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

//��KeyStore��֤���ļ��� �ֱ��ȡ˽Կ�͹�Կ������ǩ���� ��֤��
//ʹ���˵�������Providerʵ���˼��ܺͽ���

public class RSACryptoString {
	static BASE64Encoder enc = new BASE64Encoder();

	static BASE64Decoder dec = new BASE64Decoder();

	static PublicKey pubKey;

	static PrivateKey priKey;

	public static void main(String[] args) {
		String message = "This is just an example";
		byte[] original;

		try {

			//�õ���Կ�Բ���������,������Կ
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
			random.setSeed(12345678);
			keyGen.initialize(1024, random);
			KeyPair pair = keyGen.generateKeyPair();

			//�õ���Կ��˽Կ
			PrivateKey priv = pair.getPrivate();
			PublicKey pub = pair.getPublic();

			//�õ������������
			Cipher cipher = Cipher.getInstance("RSA", "SunJCE");
			System.out.println("Original string: " + message);

			//�ù�Կ����
			System.out.println("����:");
			cipher.init(Cipher.ENCRYPT_MODE, pub);
			original = message.getBytes();
			byte[] encrypted = cipher.doFinal(original);
			//���ܺ��Base64����
			System.out.println("���ܺ������:" + enc.encode(encrypted));
			// ��˽Կ����
			System.out.println("����:");
			cipher.init(Cipher.DECRYPT_MODE, priv);
			original = cipher.doFinal(encrypted);
			String originalString = new String(original);
			System.out.println("Original string: " + originalString);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}