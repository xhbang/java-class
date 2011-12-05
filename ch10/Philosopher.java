import java.util.*;

public class Philosopher extends Thread
{
	private ChopStick leftChopStick;

	private ChopStick rightChopStick;

	private String name;

	private static Random random = new Random();

	public Philosopher(String name, ChopStick leftChopStick,
			ChopStick rightChopStick)
	{
		this.name = name;
		this.leftChopStick = leftChopStick;
		this.rightChopStick = rightChopStick;
	}

	public String getNumber()
	{
		return name;
	}

	public void run()
	{
		try {
			sleep(random.nextInt(10));
		} catch (InterruptedException e) {

		}
		synchronized (leftChopStick) {
			System.out.println(this.getNumber() + " has "
					+ leftChopStick.getNumber() + " and wait for "
					+ rightChopStick.getNumber());
			synchronized (rightChopStick) {
				System.out.println(this.getNumber() + " eating");
			}
		}
	}

	public static void main(String args[])
	{
		// �����������Ӷ���
		ChopStick chopStick1 = new ChopStick("ChopStick1");
		ChopStick chopStick2 = new ChopStick("ChopStick2");
		ChopStick chopStick3 = new ChopStick("ChopStick3");
		// ������ѧ�Ҷ��󣬲��������߰ڷſ��ӡ�
		Philosopher philosopher1 = new Philosopher("philosopher1", chopStick1,
				chopStick2);
		Philosopher philosopher2 = new Philosopher("philosopher2", chopStick2,
				chopStick3);
		Philosopher philosopher3 = new Philosopher("philosopher3", chopStick3,
				chopStick2);
		// ���������߳�
		philosopher1.start();
		philosopher2.start();
		philosopher3.start();
	}
}
