public class Account2
{
	double balance;

	public Account2(double money)
	{
		balance = money;
		System.out.println("Totle Money: " + balance);
	}

	public void withdraw(double money)
	{
		synchronized (this) {
			if (balance >= money) {
				balance = balance - money;
				System.out.println("withdraw 100 success");
			} else
				System.out.println("withdraw 100 failed!");
		}
	}
}
