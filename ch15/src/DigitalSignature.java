
import java.security.Signature;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.SignatureException;
import sun.misc.*;

/**
 * ����ǩ����ʹ��RSA˽Կ�Զ���ϢժҪǩ����Ȼ��ʹ�ù��_��֤
 */
public class DigitalSignature {
	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			System.err.println("Usage:java DigitalSignature <text>");
			System.exit(1);

		}

		byte[] plainText = args[0].getBytes("UTF8");
		//�γ�RSA��Կ��
		System.out.println("\nStart generating RSA key");
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(1024);

		KeyPair key = keyGen.generateKeyPair();
		System.out.println("Finish generating RSA key");
		//ʹ��˽�_ǩ��
		Signature sig = Signature.getInstance("SHA1WithRSA");
		sig.initSign(key.getPrivate());
		sig.update(plainText);
		byte[] signature = sig.sign();

		System.out.println(sig.getProvider().getInfo());
		System.out.println("\nSignature:");
		//ʹ��BASE64������ʾ
		System.out.println(new BASE64Encoder().encode(signature));

		//ʹ�ù��_��֤
		System.out.println("\nStart signature verification");
		sig.initVerify(key.getPublic());
		sig.update(plainText);
		try {
			if (sig.verify(signature)) {
				System.out.println("Signature verified");
			} else
				System.out.println("Signature failed");
		} catch (SignatureException e) {
			System.out.println("Signature failed");
		}
	}
}