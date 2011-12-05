/*
 * Created on 2005-7-5
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Administrator
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class FindPrime
{

    public static void main(String[] args)
    {
        int num;
        boolean isPrime = true;
        num = 1311333331;
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }
}