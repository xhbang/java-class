class Monkey { // ������
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
  Monkey monkey=new Mammal(); //monkey��Mammal �������ת�Ͷ���.
  monkey.crySpeak("I love this game");
  Mammal mammal=(Mammal)monkey; //����ת�Ͷ���ǿ��ת��Ϊ����Ķ���.
  mammal.computer(10,10);
  }
}