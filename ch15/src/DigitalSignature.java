
import java.security.Signature;
import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.SignatureException;
import sun.misc.*;

/**
 * 数字签名，使用RSA私钥对对消息摘要签名，然后使用公鈅验证
 */
public class DigitalSignature {
	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			System.err.println("Usage:java DigitalSignature <text>");
			System.exit(1);

		}

		byte[] plainText = args[0].getBytes("UTF8");
		//形成RSA公钥对
		System.out.println("\nStart generating RSA key");
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(1024);

		KeyPair key = keyGen.generateKeyPair();
		System.out.println("Finish generating RSA key");
		//使用私鈅签名
		Signature sig = Signature.getInstance("SHA1WithRSA");
		sig.initSign(key.getPrivate());
		sig.update(plainText);
		byte[] signature = sig.sign();

		System.out.println(sig.getProvider().getInfo());
		System.out.println("\nSignature:");
		//使用BASE64编码显示
		System.out.println(new BASE64Encoder().encode(signature));

		//使用公鈅验证
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