//  Monkey.java         Mammal
class  Mammal{   //���鶯����
  private int n=40;
  void crySpeak(String s) {
   System.out.println(s);
  }
}
public class Monkey extends Mammal{   // ������
void computer(int aa,int bb) {
int cc=aa*bb;
System.out.println(cc);
}
void crySpeak(String s) {
System.out.println("**"+s+"**");
}

public static void main(String args[]){
  Mammal mammal=new Monkey();  // mammal��Monkey��Ķ������ת�Ͷ���.
  mammal.crySpeak("I love this game");
  Monkey monkey=(Monkey)mammal; //����ת�Ͷ���ǿ��ת��Ϊ����Ķ���.
  monkey.computer(10,10);
  }
}
