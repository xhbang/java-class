// Exception4.java
import java.io.*;
public class Exception4{
public static void main(String args[])throws FileNotFoundException,IOException{
  FileInputStream fis=new FileInputStream("text.txt");
  int b;
  while((b=fis.read())!=-1){
   System.out.print(b);
   }
fis.close();
}
}
