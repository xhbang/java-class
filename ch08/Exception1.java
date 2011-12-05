// Exception1.java
import java.io.*;
class Exception1 {
  public static void main(String args[]){
  FileInputStream fis = new  FileInputStream("text.txt");
  int b;
  while((b=fis.read())!=-1) {
    System.out.print(b);
   }
   fis.close();
 }
}
