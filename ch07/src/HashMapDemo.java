import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		// ʹ����Java5.0�е�generics���������ԣ�
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// ��Ԫ�ؼ���ӳ��
		hm.put("John", new Integer(96));
		hm.put("Tom", new Integer(97));
		hm.put("Jane", new Integer(98));
		hm.put("Hall", new Integer(99));
		hm.put("Smith", new Integer(100));
		// �õ�ӳ����ļ���
		Set set = hm.entrySet();
		// �õ�����������ʹ�÷�������
		Iterator<Map.Entry> i = set.iterator();
		// ��ʾԪ��
		while (i.hasNext())
		{
			Map.Entry me = i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		// ��100Ԫ��John���ʻ�
		int balance = hm.get("John").intValue();
		hm.put("John", new Integer((int) (balance + 100)));
		System.out.println("John's new balance: " + hm.get("John"));
	}

}
