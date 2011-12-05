package exercise;

/**
 * ÇóÍêÊı
 * 
 * @author user
 * 
 */
public class CompleteNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getYinzi(4000);
		

	}

	public static void getYinzi(int a1) {
		int i=2;
		while (i <=a1) {
			
			if (a1 % i == 0) {
				a1 = a1 / i;
				System.out.print(" " + i);
				i=2;
			}else
			{
				i++;
				
			}
			
		}
	}
}
