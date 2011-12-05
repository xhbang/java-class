//Reverse.java
public class Reverse {
         public static void main(String args[]){
    		String strSource = new String("I love Java");
           String strDest = reverseIt ( strSource );
           System.out.println(strDest);
        }
public static String reverseIt(String source) {
          int i, len = source.length();
          StringBuffer dest = new StringBuffer(len);
          for (i = (len - 1); i >= 0; i--)
            dest.append(source.charAt(i));
          return dest.toString();
      }
}
