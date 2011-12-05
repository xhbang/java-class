import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		// 使用了Java5.0中的generics（泛化特性）
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// 把元素加入映射
		hm.put("John", new Integer(96));
		hm.put("Tom", new Integer(97));
		hm.put("Jane", new Integer(98));
		hm.put("Hall", new Integer(99));
		hm.put("Smith", new Integer(100));
		// 得到映射项的集合
		Set set = hm.entrySet();
		// 得到迭代器，并使用泛化特性
		Iterator<Map.Entry> i = set.iterator();
		// 显示元素
		while (i.hasNext())
		{
			Map.Entry me = i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		// 存100元到John的帐户
		int balance = hm.get("John").intValue();
		hm.put("John", new Integer((int) (balance + 100)));
		System.out.println("John's new balance: " + hm.get("John"));
	}

}
