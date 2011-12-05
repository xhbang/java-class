public class WithdrawThread extends Thread
{
	Account4 account;

	public WithdrawThread(Account4 acount)
	{
		this.account = acount;
	}

	public void run()
	{
		for (int i = 0; i < 5; i++)
			account.withdraw(100);
	}
}
