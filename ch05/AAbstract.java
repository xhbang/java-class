 abstract class AA{
      public int n=10;
      abstract void callme( );
      void metoo( ){
         System.out.println("InsideA's metoo() method  "+n);
      }
    }
    class BB extends AA{
      public int n=20;
     void callme( ){
       System.out.println("Inside B's callme() method  "+n);
     }
    }
    public class AAbstract{
    public static void main(String args[]){
      AA cc=new BB();
      cc.callme();
      cc.metoo();
 }
}