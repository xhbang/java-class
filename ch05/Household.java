package xing.house;
public class HouseHold{
   protected String address;
   public  String surnname;
            String givenname;


public HouseHold(String  add) {
 address =add;
}

protected String getAddress(){
   return address;
}

void setMoney(String newadd) {
   address=newadd;
}
}
