import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraysDemo
{
	public static void main(String[] args)
	{
		// 定义一个数组
		Integer array[] = new Integer[9];
		for (int i = 1; i < 10; i++)
			array[i - 1] = new Integer(-3 * i);
		// 显示，排序数组
		System.out.print("Original contents: ");
		display(array);
		Arrays.sort(array);
		System.out.print("Sorted: ");
		display(array);
		Arrays.fill(array, 0, 3, -1);
		System.out.print("After fill(): ");
		display(array);
		// 排序，显示
		Arrays.sort(array);
		System.out.print("After sorting again: ");
		display(array);
		// 收缩-9
		System.out.print("The value -9 is at location ");
		int index = Arrays.binarySearch(array, -9);
		System.out.println(index);
		// 转变成List
		List l = Arrays.asList(array);
		System.out.println("the size of list: " + l.size());
		System.out.print("the contents of list:");
		for (ListIterator i = l.listIterator(); i.hasNext();)
			System.out.print(i.next() + " ");
	}

	static void display(Integer array[])
	{
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("");
	}

}
