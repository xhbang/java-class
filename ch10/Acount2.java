public class Acount2 {
  double balance;
  public Acount2(double money){
     balance = money;
     System.out.println("Totle Money: "+balance);
   }
   public void withdraw(double money){
     synchronized (this) {
       if (balance >= money) {
         balance = balance - money;
         System.out.println("withdraw 100 success");
       }
       else
         System.out.println("withdraw 100 failed!");
     }
   }
}
