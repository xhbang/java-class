class Monkey { // 猴子类
  private int n=40;
  void crySpeak(String s) {
   System.out.println(s);
  }
}
public class Mammal extends Monkey{
void computer(int aa,int bb) {
int cc=aa*bb;
System.out.println(cc);
}
void crySpeak(String s)
{ System.out.println("**"+s+"**");
}

public static void main(String args[]){
  Monkey monkey=new Mammal(); //monkey是Mammal 对象的上转型对象.
  monkey.crySpeak("I love this game");
  Mammal mammal=(Mammal)monkey; //把上转型对象强制转化为子类的对象.
  mammal.computer(10,10);
  }
}