public class DemoPrivate{
	public int a; // 公共类型的成员变量
   	private int b; // 私有类型的成员变量

   public int getA(){ //公共类型的成员方法
			return a;
	}
   private int getB(){  //私有类型的成员方法
   		return b;
   }
	public DemoPrivate(int a,int b) { //构造方法
		this.a = a;
		this.b = b;
	}
	public static void main(String args[])
	{
		DemoPrivate aDemoPrivate = new DemoPrivate(1,2);
      //访问公共类型的成员方法
		int a = aDemoPrivate.getA();
		System.out.println("变量a的值："+a);
      //访问私有类型的成员方法
       int b = aDemoPrivate.getB();
		System.out.println("变量b的值："+b);
	}
    }