package io;
import java.io.*;
public class Console{
	public static double readDouble(){
		try{
			return Double.valueOf(readString().trim()).doubleValue();
		}catch(NumberFormatException e){
			System.err.println("Not a double");
			System.exit(-1);
			return 0.0;
		}
	}
	public static int readInt(){
		try{
			return Integer.valueOf(readString().trim()).intValue();
		}catch(NumberFormatException e){
			System.out.println("Not an Integer");
			System.exit(-1);
			return -1;
		}
	}
	private static String readString() {
		// TODO Auto-generated method stub
		String string=new String();
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
			string=in.readLine();
		}catch(IOException e){
			System.out.println("Console.readString Error");
			System.exit(-1);
		}
		return string;
	}
	//test
	public static void main(String[] args){
		double d=Console.readDouble();
		System.out.println("double is\t"+d);
	}
}