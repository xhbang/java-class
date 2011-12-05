//  Monkey.java         Mammal
class  Mammal{   //哺乳动物类
  private int n=40;
  void crySpeak(String s) {
   System.out.println(s);
  }
}
public class Monkey extends Mammal{   // 猴子类
void computer(int aa,int bb) {
int cc=aa*bb;
System.out.println(cc);
}
void crySpeak(String s) {
System.out.println("**"+s+"**");
}

public static void main(String args[]){
  Mammal mammal=new Monkey();  // mammal是Monkey类的对象的上转型对象.
  mammal.crySpeak("I love this game");
  Monkey monkey=(Monkey)mammal; //把上转型对象强制转化为子类的对象.
  monkey.computer(10,10);
  }
}
