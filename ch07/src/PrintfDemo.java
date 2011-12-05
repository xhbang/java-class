import java.util.Calendar;
import java.util.Date;

public class PrintfDemo
{

	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		Date d = new Date();
		double d1 = -234.567;
		c.add(Calendar.DATE, 2);
		System.out.printf("%1$Tc is after %n %2$TF %2$Tr %n", c, d);
		System.out.printf("%1$(4.9e\n", d1);
		System.out.printf("%1$+4.9g", d1);

	}

}
