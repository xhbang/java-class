// ClassMTest.java
class FamilyMember{      // 家族成员
static private String surname="杨";    // 定义类变量surname
private String givenname;                // 定义实例变量givenname
static String getSurname() {             // 类方法
return surname;
}
static void changeSurname(String surname) // 类方法
{
//this.surname=surname;                    // this不能使用
FamilyMember.surname=surname;
}
FamilyMember(String givenname)             //构造方法
{
this.givenname=givenname;
}
FamilyMember()                              //没有参数的方法
{
givenname="小勇";
}
public String whatIsYourName()
{
return(surname+givenname); //在类中也可以使用简单名称来引用类变量
}
}

public class ClassMTest {
public static void main(String args[]) {
System.out.println(FamilyMember.getSurname());//通过类名调用类方法
FamilyMember a=new FamilyMember("老大");
System.out.println(a.getSurname()); //通过对象实例调用类方法。
System.out.println(a.whatIsYourName());
//类变量是共有的，即使在创建了实例之后改变了类变量，实例也会知道
FamilyMember.changeSurname("曹");
System.out.println(a.whatIsYourName());
}
}