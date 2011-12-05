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
		// ����Ȼ˳�������,����,��B����A��ǰ��
		return bStr.compareTo(aStr);
	}

}

class ComparatorInTreeSet
{
	public static void main(String args[])
	{

		// ͨ������һ���Ƚ�������һ���յ�TreeSet,���ݱȽ���ȷ����˳��洢Ԫ��
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
