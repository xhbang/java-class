interface Drawing {      //������
    final double PI=3.1415926;
 double getArea();   //�ӿڷ���
}
class Rectangle implements Drawing{       // ��װ�ӿ�
double w,h;
Rectangle (double w, double h) {
this.w=w; this.h=h;
}
public double getArea(){             // ʵ�ֽӿڷ���
return w*h;
}
}

class Circle implements Drawing{
double r;
Circle (double r) {
this.r=r;
}
public double getArea(){      // ʵ�ֽӿڷ���
return PI*r*r;
}
}
public class TestInterface {
 public static void main(String args[]){
  Drawing rect=new Rectangle(2.0,7.0);
  Drawing circ=new Circle(10);
System.out.println("���ε����:"+rect.getArea());
System.out.println("Բ�����:"+circ.getArea());
}
}