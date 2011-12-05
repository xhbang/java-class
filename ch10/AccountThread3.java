public class AccountThread3 extends Thread
{
	Account2 acount;

	public AccountThread3(Account2 acount)
	{
		this.acount = acount;
	}

	public void run()
	{
		acount.withdraw(100);
	}

	public static void main(String[] args)
	{
		Account2 acount = new Account2(100);
		AccountThread3 acountThread31 = new AccountThread3(acount);
		AccountThread3 acountThread32 = new AccountThread3(acount);
		acountThread31.start();
		acountThread32.start();
	}
}