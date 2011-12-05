package intro;
import java.util.Scanner;

public class Compare3{
	public void determine(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("input 3 num");
		
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		
		double maxnum=Math.max(num1, Math.max(num2,num3));
		System.out.println("the max num is\t"+maxnum);
	}
	static void testing() {
		one:
				   for (int i = 0; i < 4; i++) {
				two:
				      for (int j = 10; j < 30; j+=10) {
				         System.out.println(i + j);
				         if (i >= 2)
				            continue one;
				      }  
				  } 
		}


	public static void main(String[] args){
//		Compare3 test=new Compare3();
//		test.determine();
		one:
			   for (int i = 0; i < 4; i++) {
			two:
			      for (int j = 10; j < 30; j+=10) {
			         System.out.println(i + j);
			         if (i >= 2)
			            continue one;
			      }  
			  } 
	}
//		int i = 9;
//		switch (i) {
//		default:		
//		System.out.println("default");
//		case 0:
//		System.out.println("zero");		
//		break;
//		case 1:		
//		System.out.println("one");
//		case 2:		
//		System.out.println("two");
		
		}
	}
	
}