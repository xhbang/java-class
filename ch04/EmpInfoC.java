// EmpInfoC.java
public class EmpInfoC {
   String name;         // ��Ա������
   String designation;  // ��Ա��ְ��
   String department;   // ��Ա�Ĳ���
   // �������Ĺ��췽��
   public  EmpInfoC(String name,String designation,
String department){ 
this.name=name;
      this.designation=designation;
      this.department=department;
}  


   void print() {       // ��Ա����
      System.out.println(name + " is " + designation + " at " + department); 
   }
  
   public static void main(String argv[]){   
     EmpInfoC employee = 
new EmpInfoC("Robert Javaman ","Manager","Coffee Shop"); 
 
        employee.print();         // ���÷���print()
     }
 }
