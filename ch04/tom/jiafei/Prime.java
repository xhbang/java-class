// Prime.java
package tom.jiafei;
public class Prime{
 public static void main(String args[]){
 int sum=0,i,j;
for( i=1;i<=50;i++) //�ҳ�50���ڵ�����.
{ for(j=2;j<=i/2;j++)
{ if(i%j==0)
break;
}
if(j>i/2) System.out.print("����"+i+" ");
}
}
}