import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo
{
	public static void main(String[] args)
	{
		// 创建一个空的List
		LinkedList ll = new LinkedList();
		ll.add(new Integer(-9));
		ll.add(new Integer(25));
		ll.add(new Integer(-25));
		ll.add(new Integer(9));
		ll.add(new Integer(1));
		ll.add(new Integer(6));
		ll.add(new Integer(-5));
		ll.add(new Integer(19));
		Collections.sort(ll);
		System.out.println(ll);
		System.out.println("the position of -5 in list:"
				+ Collections.binarySearch(ll, new Integer(-5)));
		// 创建一个支持逆序的comparator
		Comparator r = Collections.reverseOrder();
		// 使用 comparator进行排序
		Collections.sort(ll, r);
		Iterator li = ll.iterator();
		System.out.print("List sorted in reverse: ");
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();
		System.out.println("the position of -5 in list:"
				+ Collections.binarySearch(ll, new Integer(-5), r));

		Collections.shuffle(ll);
		li = ll.iterator();
		System.out.print("List shuffled: ");
		while (li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();
		System.out.println("Minimum: " + Collections.min(ll));
		System.out.println("Maximum: " + Collections.max(ll));
		System.out.println("the position of -5:"
				+ Collections.binarySearch(ll, new Integer(-5), r));
	}

}
