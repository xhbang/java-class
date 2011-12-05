package xing.friend;
import xing.house.HouseHold;
public class Mikey extends HouseHold { //Mikey和HouseHold在不同的包中.
  public Mikey(){
   super("Star flight street 110");
  }
public static void main(String args[]){
  Mikey mikey=new Mikey();
  //mikey.givenname="Johnson"; //非法,因为Jerry没有继承友好的height.
  mikey.surnname="Math"; //合法.
  mikey.address="Star flight street 110"; //合法.
  String m=mikey.getAddress(); //合法
  //mikey.setAddress("Star flight street 110");
  //上句非法,因为Jerry没有继承友好的方法setMoney.
   System.out.println(mikey.surnname+"："+m);
  }
}
