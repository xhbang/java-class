public class ToString
{
    public static void main(String[] args)
    {
        int i = -34567;
        String s = null;
        //ת���ɶ������ַ���
        System.out.println("2�����ַ���:" + Integer.toBinaryString(i));
        //ת����8�����ַ���
        System.out.println("8�����ַ���:" + Integer.toOctalString(i));
        //ת����16�����ַ���
        System.out.println("16�����ַ���:" + Integer.toHexString(i));
        //ת���ɴ����ű�ʾ��8�����ַ���
        s = Integer.toString(i, 8);
        System.out.println("������8�����ַ���:" + s);
        //��8�����ַ���ת����Integer����
        Integer I = Integer.valueOf(s, 8);
        System.out.println("Integer�����е�ֵ��"+I.intValue());
    }
}