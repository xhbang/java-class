public class GroupFour
{
    public static class Student    //���徲̬�����ڲ���
    {
    static int count;    //��̬�ڲ����еľ�̬����
    String name;
    int number;        //���
    public Student(String n1)    //��̬�ڲ���Ĺ��췽��
    {
       name=n1;
       count++;
       number=count;   //����Զ�����
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
