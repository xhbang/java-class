public class GroupThree{
    private static int count;    //��̬����GroupThree.countͳ�ư༶����
    private String name;    //ʵ������GroupThree.name��ʾ�༶����
    public class Student{

    private int count;    //ʵ������Student.count��ʾѧ��
    private String name;    //ʵ������Student.name��ʾѧ������
    public void Output(int count)
    {
count++;    //��ȡ�����Ĳ������ֲ�����
this.count++;    //ͨ�������ȡStudent.count
GroupThree.count++;    //˳��������ȡGroupThree.count
GroupThree.this.count++;  //˳����������ȡGroupThree.count
System.out.println(count+""+this.count+""+
               GroupThree.count+""+GroupThree.this.count++);
    }
    }
public Student aStu()    //�����ڲ���Student��һ������
  {
    return  new Student();
  }
  public static void main(String args[])  {

    GroupThree g3=new GroupThree ();
    g3.count=10;                 //GroupThree.count
    GroupThree.Student s1=g3.aStu();    //���ⲿ�����ڲ���Ķ���
                                     //�������ڲ����ʶGroupThree.Student
    s1.Output(5);
    }
    }
