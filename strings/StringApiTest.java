package strings;
public class StringApiTest{
	private static String s1,s2;
	public static void main(String[] args){
		if(args.length!=2)
			System.exit(-1);
		else{
			s1=args[0];
			s2=args[1];
		}
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.startsWith("shit"));
		System.out.println(s1.replace('a', 'b'));
		
		System.out.println(s1.toUpperCase());
	}
}