import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class T1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new C1());
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		Iterator i = ts.iterator();
		while (i.hasNext())
		{
			Object element = i.next();
			System.out.print(element + " ");
		}

	}

}
class C1 implements Comparator
{

	public int compare(Object a, Object b)
	{
		String aStr, bStr;
		aStr = (String) a;
		bStr = (String) b;
		// 按自然顺序的逆序,例如,把B排在A的前面
		return aStr.compareTo(bStr);
	}

}