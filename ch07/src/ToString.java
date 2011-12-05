public class ToString
{
    public static void main(String[] args)
    {
        int i = -34567;
        String s = null;
        //转换成二进制字符串
        System.out.println("2进制字符串:" + Integer.toBinaryString(i));
        //转换成8进制字符串
        System.out.println("8进制字符串:" + Integer.toOctalString(i));
        //转换成16进制字符串
        System.out.println("16进制字符串:" + Integer.toHexString(i));
        //转换成带符号表示的8进制字符串
        s = Integer.toString(i, 8);
        System.out.println("带符号8进制字符串:" + s);
        //从8进制字符串转化成Integer对象
        Integer I = Integer.valueOf(s, 8);
        System.out.println("Integer对象中的值："+I.intValue());
    }
}