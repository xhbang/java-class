//Demopub2.java
package pub2;
import pub1.*;
class Demopub2
{
	public static void main(String args[])
	{
      //ʵ����Demo1
		Demopub1 aDemo1 = new Demopub1();
      //����Demo1�еĹ�����Ա����
		aDemo1.method();
      //����Demo1�еĹ�����Ա����
		aDemo1.a = 10;
        int a = aDemo1.a;
		System.out.println("Demo1�еĹ�����Ա����a��ֵ��"+a);
	}
}
