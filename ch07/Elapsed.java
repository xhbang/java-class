public class Elapsed
{

    public static void main(String[] args)
    {
        long start, end, sum = 0;
        System.out.println("Timing a for loop from 0 to 1,000,000,000");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            sum = sum + i * i;
        }
        end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start));

    }
}