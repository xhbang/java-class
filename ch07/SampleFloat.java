public class SampleFloat
{

    public static void main(String[] args)
    {
        float f = 3.1415f;
        double d = 3.14159267;
        Float F = new Float(f);
        Double D = new Double(d);
        //转化为字符串
        System.out.println(F.toString());
        System.out.println(D.toString());
        //提取简单类型值
        f = F.floatValue();
        d = D.doubleValue();
        System.out.println(f);
        System.out.println(d);
        //比较
        System.out.println(D.equals(F));

    }
}