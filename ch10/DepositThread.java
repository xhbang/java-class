public class DepositThread extends Thread
{
	Account4 account;

	public DepositThread(Account4 account)
	{
		this.account = account;
	}

	public void run()
	{
		for (int i = 0; i < 5; i++)
			account.deposite(100);
	}
}
