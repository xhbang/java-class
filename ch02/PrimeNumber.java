//PrimeNumber.java
public class PrimeNumber{
    public static void main(String[] args)
    {
        int MAX=Integer.parseInt(args[0]); //命令行参数
        int SIZE=MAX/3;
        int primeNo[]=new int[SIZE];//素数集合
        int i,j,k,n;
        primeNo[0]=2; //把第一个素数放入素数集合
        n=1; //素数的个数
        i=1; //下一个素数存放的位置
        j=3; //从奇数开始测试，偶数不需要测试
        do{
          k=0;
          while(k<n&&(j%primeNo[k]!=0))  //测试j。
             k++;
          if(k==n)           //j是素数
          {
            primeNo[i]=j;  //  j放入到素数集中
            i++;           //下标递增
            n++;           // 素数个数增加
          }
          j+=2;           //测试下一个数
        }while (j<MAX);
        System.out.println("all prime number between 2~"+MAX+" are :");
        for(i=0;i<primeNo.length;i++)
        {
         System.out.print(" "+primeNo[i]);
         if((i+1)%10==0) System.out.println();
        }
        System.out.println();
        System.out.println("the total number is:"+n);
    }
}
