import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class ComparatorDemo implements Comparator
{

	public int compare(Object a, Object b)
	{
		String aStr, bStr;
		aStr = (String) a;
		bStr = (String) b;
		// 按自然顺序的逆序,例如,把B排在A的前面
		return bStr.compareTo(aStr);
	}

}

class ComparatorInTreeSet
{
	public static void main(String args[])
	{

		// 通过传递一个比较器构造一个空的TreeSet,根据比较器确定的顺序存储元素
		TreeSet ts = new TreeSet(new ComparatorDemo());
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
