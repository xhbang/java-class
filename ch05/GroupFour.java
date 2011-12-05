public class GroupFour
{
    public static class Student    //定义静态公用内部类
    {
    static int count;    //静态内部类中的静态变量
    String name;
    int number;        //序号
    public Student(String n1)    //静态内部类的构造方法
    {
       name=n1;
       count++;
       number=count;   //序号自动增加
    }
    public void output()
    {
    System.out.println(this.name+"  number="+this.number);
    }
    }
    public static void main(String args[])
    {
    GroupFour.Student s1=new GroupFour.Student("A");
     s1.output();
     GroupFour.Student s2=new GroupFour.Student("B");
     s2.output();
     }
    }
