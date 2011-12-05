class DepositeThread extends Thread {
  Acount4 acount;
  public DepositeThread(Acount4 acount) {
  this.acount = acount;
  }
  public void run(){
    for(int i=0;i<5;i++)
      acount.deposite(100);
  }
}
