//PrimeNumber.java
public class PrimeNumber{
    public static void main(String[] args)
    {
        int MAX=Integer.parseInt(args[0]); //�����в���
        int SIZE=MAX/3;
        int primeNo[]=new int[SIZE];//��������
        int i,j,k,n;
        primeNo[0]=2; //�ѵ�һ������������������
        n=1; //�����ĸ���
        i=1; //��һ��������ŵ�λ��
        j=3; //��������ʼ���ԣ�ż������Ҫ����
        do{
          k=0;
          while(k<n&&(j%primeNo[k]!=0))  //����j��
             k++;
          if(k==n)           //j������
          {
            primeNo[i]=j;  //  j���뵽��������
            i++;           //�±����
            n++;           // ������������
          }
          j+=2;           //������һ����
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
