package intro;
public class StatementTest{
	double d=Math.cos(Math.toRadians(42));
	long l=-2;
	double d2=0.23132d;
	int _underlineisok;
	static char ch='\ucafe';
	
	static void print(){
		System.out.println("ch:\t"+ch);	
	}
	public static void main(String[] args){
		print();
	}
}