// CovertString.java
public class CovertString
{
  public static void main(String args[])
  {
int nInt = 10;
float fFloat = 3.14f;
double dDouble = 3.1415926;

    //转换为整型
Integer obj1 = new Integer(nInt);
//转换为浮点数类型
Float obj2= new Float(fFloat);
//转换为双精度类型
Double obj3 = new Double(dDouble);

    //分别调用toString方法转换为字符串
String strString1 = obj1.toString();
System.out.println(strString1);
String strString2 = obj2.toString();
System.out.println(strString2);
String strString3 = obj3.toString();
System.out.println(strString3);
  }
}
