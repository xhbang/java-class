// Construction
class Demo
{
  
   int a,b,c;//成员变量
   public Demo()          //构造方法1
   {
	}
   public Demo(int a)     //构造方法2
   {
		this.a = a;
   }
 
   public Demo(int a,int b) //构造方法3
   {
		this.a = a;
		this.b = b;
	}
   public Demo(int a,int b,int c) //构造方法4
   {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class ConstructionOverload
{
	public static void main(String args[])
   {
      //应用第一种构造方法
	   Demo aDemo = new Demo();
       System.out.println("方法一成员变量a："+aDemo.a);
       System.out.println("方法一成员变量b："+aDemo.b);
       System.out.println("方法一成员变量c："+aDemo.c);
      //应用第二种构造方法
		Demo bDemo = new Demo(1);
       System.out.println("方法二成员变量a："+bDemo.a);
       System.out.println("方法二成员变量b："+bDemo.b);
       System.out.println("方法二成员变量c："+bDemo.c);
      //应用第三种构造方法
		Demo cDemo = new Demo(1,2);
       System.out.println("方法三成员变量a："+cDemo.a);
       System.out.println("方法三成员变量b："+cDemo.b);
       System.out.println("方法三成员变量c："+cDemo.c);
      //应用第四种构造方法
		Demo dDemo = new Demo(1,2,3);
       System.out.println("方法四成员变量a："+dDemo.a);
       System.out.println("方法四成员变量b："+dDemo.b);
       System.out.println("方法四成员变量c："+dDemo.c);
	}
}
