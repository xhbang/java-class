//Demopro4.Java
package pro4;
import pro3.*;
public class Demopro4
{
	public static void main(String args[])
	{
      //ʵ����Demo1
		Demopro3 aDemo1 = new Demopro3();
      //���ܷ���Demopro3�еı������ͳ�Ա����
      //ԭ���Ǹ÷�����protected����
		//aDemo1.method();
      //����Demopro3�еĹ�����Ա����
		aDemo1.a = 10;
        int a = aDemo1.a;
		System.out.println("Demopro3�еĹ�����Ա����a��ֵ��"+a);
	}
}
