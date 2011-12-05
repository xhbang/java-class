import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo
{

	public static void main(String[] args)
	{
		// ������һ��TreeMap��ʹ����java5.0�ķ�������
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// ����Ԫ��
		tm.put("E", new Double(3444.44));
		tm.put("A", new Double(3444.34));
		tm.put("B", new Double(124.22));
		tm.put("C", new Double(1338.00));
		tm.put("F", new Double(94.22));
		tm.put("D", new Double(-15.08));
		// �õ��ؼ����б�
		Set set = tm.keySet();
		// �õ�������
		Iterator<String> i = set.iterator();
		// ͨ����������ʾTreeMap�е�ֵ
		while (i.hasNext())
		{
			String key = i.next();
			System.out.println(key + ": " + tm.get(key).doubleValue());
		}
		// �� 1000 ��D's �ʻ�
		double balance = tm.get("D").doubleValue();
		tm.put("D", new Double(balance + 1000));
		System.out.println("D's new balance: " + tm.get("D"));
	}

}
