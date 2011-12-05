 public class GroupTwo{
        private int count;    //外部类的私有成员变量
        public class Student {    //声明内部类
          String name;
          public Student(String n1) {
           name=n1;
           count++;    //存取其外部类的成员变量
          }
         public void Output(){
           System.out.println(this.name);
          }
         }
      public void output(){   //外部类的实例成员方法
         Student s1=new Student("Johnson");    //建立内部类对象"
         s1.Output();    //通过s1调用内部类的成员方法
         System.out.println("count="+this.count);
      }
    public static void main(String args[]){
       GroupTwo g2=new GroupTwo();
       g2.output();
    }
    }
