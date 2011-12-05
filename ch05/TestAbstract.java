abstract class Drawing {
public abstract double getArea();
}
class Rectangle extends Drawing{
double w,h;
Rectangle (double w, double h) {
this.w=w; this.h=h;
}
public double getArea()
{ return w*h;
}
}

class Circle extends Drawing{
double r;
Circle (double r) {
this.r=r;
}
public double getArea(){
return (3.1415926*r*r);
}
}
public class TestAbstract {
 public static void main(String args[]){
 Rectangle rect=new Rectangle(2.0,7.0);
 Circle    circ=new Circle(10);

System.out.println("矩形的面积:"+rect.getArea());
System.out.println("圆的面积:"+circ.getArea());
}
}

