// Construction
class Demo
{
  
   int a,b,c;//��Ա����
   public Demo()          //���췽��1
   {
	}
   public Demo(int a)     //���췽��2
   {
		this.a = a;
   }
 
   public Demo(int a,int b) //���췽��3
   {
		this.a = a;
		this.b = b;
	}
   public Demo(int a,int b,int c) //���췽��4
   {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class ConstructionOverload
{
	public static void main(String args[])
   {
      //Ӧ�õ�һ�ֹ��췽��
	   Demo aDemo = new Demo();
       System.out.println("����һ��Ա����a��"+aDemo.a);
       System.out.println("����һ��Ա����b��"+aDemo.b);
       System.out.println("����һ��Ա����c��"+aDemo.c);
      //Ӧ�õڶ��ֹ��췽��
		Demo bDemo = new Demo(1);
       System.out.println("��������Ա����a��"+bDemo.a);
       System.out.println("��������Ա����b��"+bDemo.b);
       System.out.println("��������Ա����c��"+bDemo.c);
      //Ӧ�õ����ֹ��췽��
		Demo cDemo = new Demo(1,2);
       System.out.println("��������Ա����a��"+cDemo.a);
       System.out.println("��������Ա����b��"+cDemo.b);
       System.out.println("��������Ա����c��"+cDemo.c);
      //Ӧ�õ����ֹ��췽��
		Demo dDemo = new Demo(1,2,3);
       System.out.println("�����ĳ�Ա����a��"+dDemo.a);
       System.out.println("�����ĳ�Ա����b��"+dDemo.b);
       System.out.println("�����ĳ�Ա����c��"+dDemo.c);
	}
}
