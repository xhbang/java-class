public class Account3 extends Thread
{
	double balance;

	public Account3(double money)
	{
		balance = money;
		System.out.println("Totle Money: " + balance);
	}

	public synchronized void withdraw(double money)
	{
		if (balance >= money) {
			balance = balance - money;
			System.out.println("withdraw 100 success");
		} else
			System.out.println("withdraw 100 failed!");
	}
}
