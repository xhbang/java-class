public class DemoPrivate{
	public int a; // �������͵ĳ�Ա����
   	private int b; // ˽�����͵ĳ�Ա����

   public int getA(){ //�������͵ĳ�Ա����
			return a;
	}
   private int getB(){  //˽�����͵ĳ�Ա����
   		return b;
   }
	public DemoPrivate(int a,int b) { //���췽��
		this.a = a;
		this.b = b;
	}
	public static void main(String args[])
	{
		DemoPrivate aDemoPrivate = new DemoPrivate(1,2);
      //���ʹ������͵ĳ�Ա����
		int a = aDemoPrivate.getA();
		System.out.println("����a��ֵ��"+a);
      //����˽�����͵ĳ�Ա����
       int b = aDemoPrivate.getB();
		System.out.println("����b��ֵ��"+b);
	}
    }