class Variable{
	int x=0,y=0,z=0; //类成员变量
	void init(int x,int y){
	this.x=x;
	this.y=y;
	int z=5;  // 局部变量
	System.out.println("****in init****");
	System.out.println(" x="+x+" y="+y+" z="+z);		
	}
}

public class VariableTest{
	public static void main(String args[]){
     Variable v=new Variable();
     System.out.println("****before init****");
     System.out.println(" x="+v.x+" y="+v.y+" z="+v.z);
     v.init(20,30);
     System.out.println("****after init****");
     System.out.println(" x="+v.x+" y="+v.y+" z="+v.z);
	}
}