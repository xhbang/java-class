import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo
{

	public static void main(String[] args)
	{
		// 创建了一个TreeMap，使用了java5.0的泛化特性
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// 放入元素
		tm.put("E", new Double(3444.44));
		tm.put("A", new Double(3444.34));
		tm.put("B", new Double(124.22));
		tm.put("C", new Double(1338.00));
		tm.put("F", new Double(94.22));
		tm.put("D", new Double(-15.08));
		// 得到关键字列表
		Set set = tm.keySet();
		// 得到迭代器
		Iterator<String> i = set.iterator();
		// 通过迭代器显示TreeMap中的值
		while (i.hasNext())
		{
			String key = i.next();
			System.out.println(key + ": " + tm.get(key).doubleValue());
		}
		// 存 1000 到D's 帐户
		double balance = tm.get("D").doubleValue();
		tm.put("D", new Double(balance + 1000));
		System.out.println("D's new balance: " + tm.get("D"));
	}

}
