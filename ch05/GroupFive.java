public class GroupFive
{
    public abstract class Student_abstract    //�����ڲ���
    {
      int count;
      String name;
      public abstract void output();    //���󷽷�
    }
    public class Student extends Student_abstract    //�̳г����ڲ���
    {
    public Student(String n1)
    {
    name=n1;
    count++;    //Student.count
    }
    public void output(){   //ʵ�ֳ��󷽷�
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
