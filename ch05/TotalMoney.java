interface Convert
   {
    float x=30.5f;
    float y=4.6f;
    float total();
   }
// ���ϲ���Ҳ���Ա���ΪConvert.java����������
public class TotalMoney  implements Convert
   {
    float dollar,money;
    TotalMoney (float a,float b)
         {dollar=a;money=b;}
    public float total()
         {return dollar*x+money/y;}
    public static void main(String args[])
      {
       TotalMoney z=new TotalMoney (120,4000);
       System.out.println("����="+z.dollar);
       System.out.println("�����="+z.money);
       System.out.println("�ۺ�̨��="+z.total());
    }
   }
