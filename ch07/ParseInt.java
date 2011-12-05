public class ParseInt
{

    public static void main(String[] args)
    {
        String s1 = "12";
        String s2 = "34";
        String s = null;
        int i1 = 0, i2 = 0, sum = 0;

        //把字符串转换成整数
        i1 = Integer.parseInt(s1);
        i2 = new Integer(s2).intValue();
        sum = i1 + i2;
        //把整数转换成字符串
        s = Integer.toString(sum);
        System.out.println(s);
    }
}