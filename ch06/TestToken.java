import java.util.*;
public class TestToken
{
   public static void main(String args[])
   {
      //����StringTokenizer����
	StringTokenizer st = new StringTokenizer("this is a Java programming");
  	//���ַ�����ƥ��Ĭ�ϵķָ���
        while(st.hasMoreTokens())
        {
            //��ӡ��ǰ�ָ�������һ�ָ���֮�������
		     System.out.println(st.nextToken());
      }
   }
}
