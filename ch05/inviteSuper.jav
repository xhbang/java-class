class superClass {
int y;
superClass( ) {
   y=30;
   System.out.println("in superClass:y="+y");
}
void doPrint(){
   System.out.println("In superClass.doPrint()");
}
}


class subclass extends superClass{
   int y;
   subclass( ){
     super();  //call constructor of superClass
     y=50;
   System.out.println("in subClass:y="+y);
     }
  void doPrint( ){
     super.doPrint();  // call method of superClass
     System.out.println("in subclass.doPrint()");
     System.out.println("super.y="+super.y+"  sub.y"+y);
}
}

public class inviteSuper{
  public static void main(string args[]){
  subclass subSC=new subclass();
  subSC.doPrint( );
}
}
