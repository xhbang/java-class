//Account.java
class Account
{
	double balance;

	public Account(double money)
	{
		balance = money;
		System.out.println("Totle Money: " + balance);
	}
}

public class AccountThread extends Thread
{
	Account Account;

	int delay;

	public AccountThread(Account Account, int delay)
	{
		this.Account = Account;
		this.delay = delay;
	}

	public void run()
	{
		if (Account.balance >= 100) {
			try {
				sleep(delay);
				Account.balance = Account.balance - 100;
				System.out.println("withdraw  100 successful!");
			} catch (InterruptedException e) {
			}
		} else
			System.out.println("withdraw failed!");
	}

	public static void main(String[] args)
	{
		Account Account = new Account(100);
		AccountThread AccountThread1 = new AccountThread(Account, 1000);
		AccountThread AccountThread2 = new AccountThread(Account, 0);
		AccountThread1.start();
		AccountThread2.start();
	}
}
