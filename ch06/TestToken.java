import java.util.*;
public class TestToken
{
   public static void main(String args[])
   {
      //构造StringTokenizer对象
	StringTokenizer st = new StringTokenizer("this is a Java programming");
  	//在字符串中匹配默认的分隔符
        while(st.hasMoreTokens())
        {
            //打印当前分隔符和下一分隔符之间的内容
		     System.out.println(st.nextToken());
      }
   }
}
