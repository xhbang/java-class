// classMethodTest.java
class member
{
static int classVar;
       int instanceVar;

static void setClassVar(int i){
    classVar=i;
// instanceVar=i; //在类方法中不能引用实例成员。
}

static int getClassVar( ){
  return classVar;
}

void setInstanceVar(int i ){
   classVar=i;
   instanceVar=i;
}

int getInstanceVar(){
	return instanceVar;
  }
}

public class classMethodTest{
 public static void main(String args[]){
 member  m1=new member( );
 member  m2=new member( );
 m1.setClassVar(1);
 m2.setClassVar(2);
System.out.println("m1.classVar="+m1.getClassVar( )+ " m2.classVar="+m2.getClassVar( ));
 m1.setInstanceVar(11);
 m2.setInstanceVar(22);
System.out.println("m1.InstanceVar="+m1.getInstanceVar( )+ " m2.InstanceVar="+m2.getInstanceVar( ));
}
}
