public class EmpInfo {
   String name;         // ��Ա������
   String designation;  // ��Ա��ְ��
   String department;   // ��Ա�Ĳ���

   void print() {       // ��Ա����
      System.out.println(name + " is " + designation + " at " + department); 
   }
  
   public static void main(String argv[]){   
     EmpInfo employee = new EmpInfo();    // ��������ʵ����
     employee.name = " Robert Javaman " ; // �������Ա��ֵ
     employee.designation = " Manager " ; // 
     employee.department = " Coffee Shop " ; // 
     employee.print();                    // ���÷���print()
     }
 }
