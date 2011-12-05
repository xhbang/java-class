
import java.util.ArrayList;

public class ListToArray
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add(new Double(10.3));
        al.add(new Double(20.4));
        al.add(new Double(30.5));
        al.add(new Double(40.6));
        al.add(new Double(40.7));

        System.out.println("ÄÚÈÝ: " + al);
        Object a[] = al.toArray();
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += ((Double) a[i]).doubleValue();
        System.out.println("Sum : " + sum);
    }
}