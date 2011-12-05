//Demopub2.java
package pub2;
import pub1.*;
class Demopub2
{
	public static void main(String args[])
	{
      //实例化Demo1
		Demopub1 aDemo1 = new Demopub1();
      //访问Demo1中的公共成员方法
		aDemo1.method();
      //访问Demo1中的公共成员变量
		aDemo1.a = 10;
        int a = aDemo1.a;
		System.out.println("Demo1中的公共成员变量a的值："+a);
	}
}
