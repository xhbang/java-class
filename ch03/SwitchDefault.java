public class SwitchDefault
{

    public static void main(String[] args)
    {
        for (int i = 1; i <= 7; i++)
            switch (i) {
            default:
                System.out.println("it is other day.");
                break;
            case 1:
                System.out.println("it is Mon.");
                break;
            case 2:
                System.out.println("it is Tue.");
                break;
            case 3:
                System.out.println("it is Wed.");
                break;
            case 4:
                System.out.println("it is Thu.");
                break;

            }
    }
}