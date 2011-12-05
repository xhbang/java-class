//B.java
class A  {  //类A
       //公共类型的成员变量
	 public int n;
	 public A()	{
	 }
    public A(int n){
		 this.n = n;
	 }
    int method(){
		return n;
    }
}
public class B extends A { //类B
	public B()	{
		super(5);
	}
	public static void main(String args[]){
	    A aInstance = new B( );  //实例化A
    	// aInstance.n = 10; //为类A的公共类型成员变量赋值
		int b=aInstance.method();//访问类A中的方法
		System.out.println("类A中的成员变量："+b);
	}
}
