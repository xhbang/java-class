// MumberToken.java
 import java.util.*;
public class MumberToken{
public static void main(String args[]){
String s="I am Xing.zh.l,she is my girlfriend";
StringTokenizer fenxi=new StringTokenizer(s," ,"); //�ո�Ͷ�������
int number=fenxi.countTokens();
while(fenxi.hasMoreTokens()){
String str=fenxi.nextToken();
System.out.println(str);
System.out.println("��ʣ"+fenxi.countTokens()+"������");
}
System.out.println("s���е���"+number+"��");
}
}
