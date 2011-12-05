public class TwoArrayAvg
{
    public static void main(String[] args)
    {
        final int ONE_SIZE=2;
        final int TWO_SIZE=5;
        int two[][]=new int[ONE_SIZE][TWO_SIZE];
        int i=0,j=0;
        int sum=0;
        double avg=0.0;
        for(i=0;i<two.length;i++)
        {
           for(j=0;j<two[i].length;j++)
           {
               two[i][j]=(int)(Math.random()*10);
               sum=sum+two[i][j];
               System.out.print("  "+two[i][j]);
            }
            System.out.println();
        }
        avg=(double)sum/(two.length*two[0].length);
        System.out.println("average="+avg);
    }
}
