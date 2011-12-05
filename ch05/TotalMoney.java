interface Convert
   {
    float x=30.5f;
    float y=4.6f;
    float total();
   }
// 以上部分也可以保存为Convert.java，单独编译
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
       System.out.println("美金="+z.dollar);
       System.out.println("人民币="+z.money);
       System.out.println("折合台币="+z.total());
    }
   }
