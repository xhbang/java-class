public class GroupThree{
    private static int count;    //静态变量GroupThree.count统计班级数量
    private String name;    //实例变量GroupThree.name表示班级名称
    public class Student{

    private int count;    //实例变量Student.count表示学号
    private String name;    //实例变量Student.name表示学生姓名
    public void Output(int count)
    {
count++;    //存取方法的参数，局部变量
this.count++;    //通过对象存取Student.count
GroupThree.count++;    //顺过类名存取GroupThree.count
GroupThree.this.count++;  //顺过对象名存取GroupThree.count
System.out.println(count+""+this.count+""+
               GroupThree.count+""+GroupThree.this.count++);
    }
    }
public Student aStu()    //返回内部类Student的一个对象
  {
    return  new Student();
  }
  public static void main(String args[])  {

    GroupThree g3=new GroupThree ();
    g3.count=10;                 //GroupThree.count
    GroupThree.Student s1=g3.aStu();    //在外部创建内部类的对象
                                     //完整的内部类标识GroupThree.Student
    s1.Output(5);
    }
    }
