// CovertString.java
public class CovertString
{
  public static void main(String args[])
  {
int nInt = 10;
float fFloat = 3.14f;
double dDouble = 3.1415926;

    //ת��Ϊ����
Integer obj1 = new Integer(nInt);
//ת��Ϊ����������
Float obj2= new Float(fFloat);
//ת��Ϊ˫��������
Double obj3 = new Double(dDouble);

    //�ֱ����toString����ת��Ϊ�ַ���
String strString1 = obj1.toString();
System.out.println(strString1);
String strString2 = obj2.toString();
System.out.println(strString2);
String strString3 = obj3.toString();
System.out.println(strString3);
  }
}
