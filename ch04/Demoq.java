//Demoq.Java
package p1;
class Demoq{
	public static void main(String args[]){
	    Demop aDemo1 = new Demop();  //实例化Demo1
      	aDemo1.method();    //访问Demo1类中的公共成员方法
       	aDemo1.a = 20;      //访问Demo1类中的公共成员变量
       int a = aDemo1.a;
		System.out.println("Demo1中的公共成员变量a的值："+a);
	}
}
