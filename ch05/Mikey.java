package xing.friend;
import xing.house.HouseHold;
public class Mikey extends HouseHold { //Mikey��HouseHold�ڲ�ͬ�İ���.
  public Mikey(){
   super("Star flight street 110");
  }
public static void main(String args[]){
  Mikey mikey=new Mikey();
  //mikey.givenname="Johnson"; //�Ƿ�,��ΪJerryû�м̳��Ѻõ�height.
  mikey.surnname="Math"; //�Ϸ�.
  mikey.address="Star flight street 110"; //�Ϸ�.
  String m=mikey.getAddress(); //�Ϸ�
  //mikey.setAddress("Star flight street 110");
  //�Ͼ�Ƿ�,��ΪJerryû�м̳��Ѻõķ���setMoney.
   System.out.println(mikey.surnname+"��"+m);
  }
}
