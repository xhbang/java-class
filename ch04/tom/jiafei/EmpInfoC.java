// EmpInfoC.java
public class EmpInfoC {
   String name;         // 雇员的姓名
   String designation;  // 雇员的职务
   String department;   // 雇员的部门
   // 带参数的构造方法
   public  EmpInfoC(String name,String designation,
String department){ 
this.name=name;
      this.designation=designation;
      this.department=department;
}  


   void print() {       // 成员方法
      System.out.println(name + " is " + designation + " at " + department); 
   }
  
   public static void main(String argv[]){   
     EmpInfoC employee = 
new EmpInfoC("Robert Javaman ","Manager","Coffee Shop"); 
 
        employee.print();         // 调用方法print()
     }
 }
