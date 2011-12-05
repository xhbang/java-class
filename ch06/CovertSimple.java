// CovertSimple.java
public class CovertSimple{
  public static void main(String args[]){
  char[] cArray;
int nInt;
float fFloat;
double dDouble;
       //生成相应的数据类型
       String strString = new String("I love Java");
       String strInteger = new String("314");
       String strFloat = new String("3.14");
       String strDouble = new String("3.1416");
//分别调用各类中的静态方法
cArray = strString.toCharArray();
System.out.println(cArray);
nInt = Integer.parseInt(strInteger);
System.out.println(nInt);
fFloat = Float.parseFloat(strFloat);

System.out.println(fFloat);
dDouble = Double.parseDouble(strDouble);

System.out.println(dDouble);
  }
}
