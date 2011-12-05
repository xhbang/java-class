package ch17.converter.client;

import java.math.BigDecimal;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import ch17.converter.ejb.ConverterRemote;

public class ConverterClient
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			Properties props = new Properties();
			props.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");
			props.setProperty("java.naming.provider.url", "localhost:1099");
			props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");

			InitialContext ctx = new InitialContext(props);
			ConverterRemote converter = (ConverterRemote) ctx.lookup("ConverterBean/remote");
			ConverterClient client = new ConverterClient();
			client.doConversion(converter);
		}
		catch (NamingException e)
		{
			e.printStackTrace();
		}
	}

	public void doConversion(ConverterRemote converter)
	{
		try
		{
			BigDecimal param = new BigDecimal("100.00");
			BigDecimal rmbAmount = converter.dollarToRMB(param);

			System.out.println("$" + param + " is " + rmbAmount + " Yuan.");

			BigDecimal euroAmount = converter.RMBToEuro(rmbAmount);
			System.out.println(rmbAmount + " Yuan is " + euroAmount + " Euro.");

			System.exit(0);
		}
		catch (Exception ex)
		{
			System.err.println("Caught an unexpected exception!");
			ex.printStackTrace();
		}
	}

}
