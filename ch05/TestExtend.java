class Father{
private int money;
float weight,height;
String head;
String speak(String s) {
return s ;
}
}
class Son extends Father{
String hand ,foot;
}
public class TestExtend {
  public static void main(String args[]){
   Son boy=new Son();
boy.weight=120f; boy.height=1.8f;
boy.head="һ��ͷ"; boy.hand="��ֻ��";
boy.foot="��ֻ��";
   System.out.println("���Ƕ���");
   System.out.println("����:"+boy.hand+"��"+boy.foot+"��"+ boy.head+"����"+boy.weight+"����"+boy.height);
}
}
