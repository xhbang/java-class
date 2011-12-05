public class EmpInfo {
   String name;         // 雇员的姓名
   String designation;  // 雇员的职务
   String department;   // 雇员的部门

   void print() {       // 成员方法
      System.out.println(name + " is " + designation + " at " + department); 
   }
  
   public static void main(String argv[]){   
     EmpInfo employee = new EmpInfo();    // 创建对象并实例化
     employee.name = " Robert Javaman " ; // 给对象成员赋值
     employee.designation = " Manager " ; // 
     employee.department = " Coffee Shop " ; // 
     employee.print();                    // 调用方法print()
     }
 }
