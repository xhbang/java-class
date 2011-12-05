public class AcountThread2 extends Thread {
  Acount acount;
  int delay;
  Semaphore semaphore;
  public AcountThread2(Acount acount,int delay,Semaphore semaphore) {
    this.acount =acount;
    this.delay = delay;
    this.semaphore = semaphore;
  }
  public void run(){
    synchronized (semaphore) {
      if (acount.balance >= 100) {
        try {
          sleep(delay);
          acount.balance = acount.balance - 100;
          System.out.println("withdraw  100 successful!");
        }
        catch (InterruptedException e) {
        }
      }
      else
        System.out.println("withdraw failed!");
    }
  }
  public static void main(String[] args) {
    Acount acount = new Acount(100);
    Semaphore semaphore = new Semaphore();
    AcountThread2 acountThread1 = new AcountThread2(acount,1000,semaphore);
    AcountThread2 acountThread2 = new AcountThread2(acount,0,semaphore);
    acountThread1.start();
    acountThread2.start();
  }
}
