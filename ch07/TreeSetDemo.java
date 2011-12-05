import java.util.TreeSet;
public class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet hs = new TreeSet();
		hs.add("D");
		hs.add("E");
		hs.add("F");
		hs.add("A");
		hs.add("B");
		hs.add("C");		
		hs.add("A");
		System.out.println(hs);
		System.out.println(hs.first());
		System.out.println(hs.last());			
	}
}
