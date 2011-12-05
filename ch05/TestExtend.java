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
boy.head="一个头"; boy.hand="两只手";
boy.foot="两只脚";
   System.out.println("我是儿子");
   System.out.println("我有:"+boy.hand+"、"+boy.foot+"、"+ boy.head+"、重"+boy.weight+"、高"+boy.height);
}
}
