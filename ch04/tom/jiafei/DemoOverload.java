//DemoOverload.java
class Demo2
{
   int a,b;
   
   int method()      //��Ա����һ
   {
		return a+b;
   }
   int method(int c) //��Ա������
   {
		return a+b+c;
   }
   int method(int c,int d) //��Ա������
   {
		return a+b+c+d;
   }
   Demo2(int a,int b)  //���췽��
   {
		this.a = a;
       this.b = b;
   }
}
public class DemoOverload
{
	public static void main(String args[])
	{
       
	   Demo2 aDemo2 = new Demo2(1,2); //ʵ����
       int a = aDemo2.method(); //���ó�Ա����
       System.out.println(a); 
       int b = aDemo2.method(3); //���ó�Ա����
       System.out.println(b);
       int c = aDemo2.method(3,4);//���ó�Ա����
       System.out.println(c);
	}
}
