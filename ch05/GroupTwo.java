 public class GroupTwo{
        private int count;    //�ⲿ���˽�г�Ա����
        public class Student {    //�����ڲ���
          String name;
          public Student(String n1) {
           name=n1;
           count++;    //��ȡ���ⲿ��ĳ�Ա����
          }
         public void Output(){
           System.out.println(this.name);
          }
         }
      public void output(){   //�ⲿ���ʵ����Ա����
         Student s1=new Student("Johnson");    //�����ڲ������"
         s1.Output();    //ͨ��s1�����ڲ���ĳ�Ա����
         System.out.println("count="+this.count);
      }
    public static void main(String args[]){
       GroupTwo g2=new GroupTwo();
       g2.output();
    }
    }
