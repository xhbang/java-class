// MultInterfaces.java
interface I1 {
  abstract void test(int i);
}
interface I2 {
  abstract void test(String s);
}

public class MultInterfaces implements I1, I2 {
  public void test(int i) {
    System.out.println("In MultInterfaces.I1.test");
  }
  public void test(String s) {
    System.out.println("In MultInterfaces.I2.test");
  }
  public static void main(String[] a) {
    MultInterfaces t = new MultInterfaces();
    t.test(42);
    t.test("Hello");
  }
}


