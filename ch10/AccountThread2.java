 //Semaphore.java
class Semaphore{}

public class AccountThread2 extends Thread {
  Account account;
  int delay;
  Semaphore semaphore;
  public AccountThread2(Account Account,int delay,Semaphore semaphore) {
    this.account =Account;
    this.delay = delay;
    this.semaphore = semaphore;
  }
  public void run(){
    synchronized (semaphore) {
      if (account.balance >= 100) {
        try {
          sleep(delay);
          account.balance = account.balance - 100;
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
    Account Account = new Account(100);
    Semaphore semaphore = new Semaphore();
    AccountThread2 AccountThread1 = new AccountThread2(Account,1000,semaphore);
    AccountThread2 AccountThread2 = new AccountThread2(Account,0,semaphore);
    AccountThread1.start();
    AccountThread2.start();
  }
}
