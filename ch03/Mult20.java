package exercise;
/**
 * ����1��10�Ľ׳˵ĺ�
 * @author user
 *
 */
public class Mult20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int sum=0;
      int mid=1;
      for(int i=1;i<=10;i++)
      {
    	 mid=1;
    	  for(int j=1;j<=i;j++)
    		  {
    		   mid=mid*j;
    		  };
    		  sum=sum+mid;
     }
	System.out.println("�ܺ��ǣ�"+sum);	
	}

}
