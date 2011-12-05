//Demopro4.Java
package pro4;
import pro3.*;
public class Demopro4
{
	public static void main(String args[])
	{
      //实例化Demo1
		Demopro3 aDemo1 = new Demopro3();
      //不能访问Demopro3中的保护类型成员方法
      //原因是该方法是protected类型
		//aDemo1.method();
      //访问Demopro3中的公共成员变量
		aDemo1.a = 10;
        int a = aDemo1.a;
		System.out.println("Demopro3中的公共成员变量a的值："+a);
	}
}
