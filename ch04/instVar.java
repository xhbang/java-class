class koA{
   int a;
   public void display(){
   System.out.print(" a="+a);
  }
 }
 public class instVar{
      public static void main(String args[]){
       koA a1=new koA(); a1.a=10;
       koA a2=new koA(); a2.a=20;
       a1.display();  a2.display();
     }
}
