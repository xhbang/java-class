
import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        // ����һ��List
        ArrayList al = new ArrayList();
        System.out.println("List�ĳ�ʼ��С: " + al.size());
        // ��List������Ԫ��
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add(1, "A2");
        System.out.println("����Ԫ����Ĵ�С: " + al.size());
        //��ʾ������
        System.out.println("List�е�����: " + al);
        //ɾ��List�е�Ԫ��
        al.remove("D");
        al.remove(2);
        System.out.println("ɾ��Ԫ�غ�Ĵ�С��" + al.size());
        System.out.println("����: " + al);
    }
}