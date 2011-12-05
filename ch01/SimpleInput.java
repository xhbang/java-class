import java.io.*;
public class SimpleInput{
    public static void main(String args[]) throws IOException{   
    String s;
    BufferedReader ir;   
    ir=new BufferedReader(new InputStreamReader(System.in));
    s=ir.readLine();
    System.out.println("Input value is:"+s);
    double  d=Double.parseDouble(s);  //将s 转换成double型
    System.out.println("Input value changed after doubled:"+Math.sqrt(d));
    }
  }
