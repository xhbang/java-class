interface Drawing {      //抽象类
    final double PI=3.1415926;
 double getArea();   //接口方法
}
class Rectangle implements Drawing{       // 安装接口
double w,h;
Rectangle (double w, double h) {
this.w=w; this.h=h;
}
public double getArea(){             // 实现接口方法
return w*h;
}
}

class Circle implements Drawing{
double r;
Circle (double r) {
this.r=r;
}
public double getArea(){      // 实现接口方法
return PI*r*r;
}
}
public class TestInterface {
 public static void main(String args[]){
  Drawing rect=new Rectangle(2.0,7.0);
  Drawing circ=new Circle(10);
System.out.println("矩形的面积:"+rect.getArea());
System.out.println("圆的面积:"+circ.getArea());
}
}