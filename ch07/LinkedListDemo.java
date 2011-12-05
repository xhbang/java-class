
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo
{

    public static void main(String[] args)
    {
        // 创建一个List
        LinkedList ll = new LinkedList();
        System.out.println("List的初始大小: " + ll.size());
        // 向List中增加元素
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add(0, "A2");
        System.out.println("增加元数后的大小: " + ll.size());
        //显示其内容
        System.out.println("List中的内容: " + ll);
        //删除List中的元素
        ll.remove("D");
        ll.remove(2);
        System.out.println("是否包含元素D：" + ll.contains("D"));
        ArrayList al = new ArrayList(ll);
        //清空List
        ll.clear();
        System.out.println("al是否为空：" + ll.isEmpty());
        ll.addAll(al);//把列表al中的所有元素加入ll
        System.out.println("List中的内容: " + ll);
        ll.addFirst("A3");
        ll.addLast("A4");
        System.out.println("List中的内容: " + ll);

    }
}