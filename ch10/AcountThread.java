public class AcountThread extends Thread {
  Acount acount;
  int delay;
  public AcountThread(Acount acount,int delay) {
    this.acount =acount;
    this.delay = delay;
  }
  public void run(){
    if(acount.balance >= 100){
         try{
           sleep(delay);
           acount.balance = acount.balance - 100;
           System.out.println("withdraw  100 successful!");
         }catch(InterruptedException e)  {       
         }
        }
        else
          System.out.println("withdraw failed!");
  }
  public static void main(String[] args) {
    Acount acount = new Acount(100);
    AcountThread acountThread1 = new AcountThread(acount,1000);
    AcountThread acountThread2 = new AcountThread(acount,0);
    acountThread1.start();
    acountThread2.start();
  }
}
