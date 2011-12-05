public class AcountThread3 extends Thread {
  Acount2 acount;
  public AcountThread3(Acount2 acount) {
    this.acount = acount;
  }
  public void run(){
    acount.withdraw(100);
  }
   public static void main(String[] args) {
     Acount2 acount = new Acount2(100);
     AcountThread3 acountThread31 = new AcountThread3(acount);
     AcountThread3 acountThread32 = new AcountThread3(acount);
     acountThread31.start();
     acountThread32.start();
  }
}
