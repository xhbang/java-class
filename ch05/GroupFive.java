public class GroupFive
{
    public abstract class Student_abstract    //抽象内部类
    {
      int count;
      String name;
      public abstract void output();    //抽象方法
    }
    public class Student extends Student_abstract    //继承抽象内部类
    {
    public Student(String n1)
    {
    name=n1;
    count++;    //Student.count
    }
    public void output(){   //实现抽象方法
      System.out.println(this.name+" count="+this.count);
    }
  }
  public GroupFive(){
    Student s1=new Student("A");
    s1.output();
    Student s2=new Student("B");
    s2.output();
    }
   public static void main(String args[]){
      GroupFive g5=new GroupFive();
    }
  }
