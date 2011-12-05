import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList<Integer>();
		int sum = 0;
		a.add(new Integer(1));
		a.add(new Integer(2));
		for (Iterator<Integer> i = a.iterator(); i.hasNext();)
		{
			sum += i.next().intValue();
		}
		System.out.println(sum);
	}

}
