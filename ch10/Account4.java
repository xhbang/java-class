public class Account4
{
	double balance;

	public Account4()
	{
		balance = 0;
		System.out.println("Totle Money: " + balance);
	}

	public synchronized void withdraw(double money)
	{
		if (balance == 0)
			try {
				wait();
			} catch (InterruptedException e) {
			}
		balance = balance - money;
		System.out.println("withdraw 100 success");
		notify();
	}

	public synchronized void deposite(double money)
	{
		if (balance != 0)
			try {
				wait();
			} catch (InterruptedException e) {
			}
		balance = balance + money;
		System.out.println("deposite 100 success");
		notify();
	}
}
