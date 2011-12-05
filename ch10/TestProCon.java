public class TestProCon
{
	public static void main(String[] args)
	{
		Account4 acount = new Account4();
		WithdrawThread withdraw = new WithdrawThread(acount);
		DepositThread deposite = new DepositThread(acount);
		withdraw.start();
		deposite.start();
	}
}
