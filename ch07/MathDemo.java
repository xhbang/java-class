public class MathDemo
{
    public static void main(String[] args)
    {
        double radians = 2 * Math.PI;
        double d1 = 3.1415655678;

        System.out.println("ceil����:" + Math.ceil(d1));
        System.out.println("Round����:" + Math.round(d1));
        System.out.println("floor����:" + Math.floor(d1));
        System.out.println("exp����:" + Math.exp(d1));
        System.out.println("pow����:" + Math.pow(Math.E, d1));
        System.out.println("sin����:" + Math.sin(Math.PI / 6));
        System.out.println("asin����:" + Math.asin(0.5));
        System.out.println("log����:" + Math.log(Math.E));
        System.out.println("�Ƕ�ת���ȣ�" + Math.toDegrees(radians));
        System.out.println("random����:" + Math.random());
        System.out.println("random����:" + Math.random());

    }
}