
public class T1 {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws Exception 
	 */
	public static void main(String[] args){
		try {
			T1.f1();
		} catch (Exception e) {
			e.fillInStackTrace();
			e.printStackTrace();
		}

	}
	
	public static void f1() throws Exception{
		throw new Exception("error1");
	}

}
