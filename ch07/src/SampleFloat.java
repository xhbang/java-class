public class SampleFloat
{

    public static void main(String[] args)
    {
        float f = 3.1415f;
        double d = 3.14159267;
        Float F = new Float(f);
        Double D = new Double(d);
        //ת��Ϊ�ַ���
        System.out.println(F.toString());
        System.out.println(D.toString());
        //��ȡ������ֵ
        f = F.floatValue();
        d = D.doubleValue();
        System.out.println(f);
        System.out.println(d);
        //�Ƚ�
        System.out.println(D.equals(F));

    }
}