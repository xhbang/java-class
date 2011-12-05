//DemoOverload.java
class Demo2
{
   int a,b;
   
   int method()      //成员方法一
   {
		return a+b;
   }
   int method(int c) //成员方法二
   {
		return a+b+c;
   }
   int method(int c,int d) //成员方法三
   {
		return a+b+c+d;
   }
   Demo2(int a,int b)  //构造方法
   {
		this.a = a;
       this.b = b;
   }
}
public class DemoOverload
{
	public static void main(String args[])
	{
       
	   Demo2 aDemo2 = new Demo2(1,2); //实例化
       int a = aDemo2.method(); //调用成员方法
       System.out.println(a); 
       int b = aDemo2.method(3); //调用成员方法
       System.out.println(b);
       int c = aDemo2.method(3,4);//调用成员方法
       System.out.println(c);
	}
}
