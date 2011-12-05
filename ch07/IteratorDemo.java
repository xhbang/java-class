import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		System.out.print("Original contents of List: ");
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		ListIterator litr = al.listIterator();
		while (litr.hasNext())
		{
			Object element = litr.next();
			litr.set(element + "++");
		}
		System.out.print("Modified list forwards: ");
		itr = al.iterator();
		while (itr.hasNext())
		{
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.print("Modified list backwards: ");
		while (litr.hasPrevious())
		{
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
