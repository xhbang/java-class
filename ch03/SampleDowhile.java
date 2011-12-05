public class SampleDowhile
{

    public static void main(String[] args)
    {

        int sum = 0, i = 100;

        do {
            i++;
            sum += i;
        } while (i < 200);

        System.out.println("the sum is " + sum);

    }
}