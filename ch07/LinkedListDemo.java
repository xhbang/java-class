
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo
{

    public static void main(String[] args)
    {
        // ����һ��List
        LinkedList ll = new LinkedList();
        System.out.println("List�ĳ�ʼ��С: " + ll.size());
        // ��List������Ԫ��
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add(0, "A2");
        System.out.println("����Ԫ����Ĵ�С: " + ll.size());
        //��ʾ������
        System.out.println("List�е�����: " + ll);
        //ɾ��List�е�Ԫ��
        ll.remove("D");
        ll.remove(2);
        System.out.println("�Ƿ����Ԫ��D��" + ll.contains("D"));
        ArrayList al = new ArrayList(ll);
        //���List
        ll.clear();
        System.out.println("al�Ƿ�Ϊ�գ�" + ll.isEmpty());
        ll.addAll(al);//���б�al�е�����Ԫ�ؼ���ll
        System.out.println("List�е�����: " + ll);
        ll.addFirst("A3");
        ll.addLast("A4");
        System.out.println("List�е�����: " + ll);

    }
}