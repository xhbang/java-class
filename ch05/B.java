//B.java
class A  {  //��A
       //�������͵ĳ�Ա����
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
public class B extends A { //��B
	public B()	{
		super(5);
	}
	public static void main(String args[]){
	    A aInstance = new B( );  //ʵ����A
    	// aInstance.n = 10; //Ϊ��A�Ĺ������ͳ�Ա������ֵ
		int b=aInstance.method();//������A�еķ���
		System.out.println("��A�еĳ�Ա������"+b);
	}
}
