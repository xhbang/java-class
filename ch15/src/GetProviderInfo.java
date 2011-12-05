//GetProviderInfo.java
import java.security.Provider;
import java.security.Security;
public class GetProviderInfo {
	public static void main(String[] args) {
		GetProviderInfo getproviderinfo = new GetProviderInfo();
		Provider[] plist = Security.getProviders();
		for (int i = 0; i < plist.length; i++) {
			System.out.println("[" + (i + 1) + "]-Provider name:"
					+ plist[i].getName());
			System.out.println("Provider info:" + plist[i].getInfo());
		}
	}
}
