import java.io.*;

public class Employee{
   // this instance variable is visible for any child class.
   public String jobtitle;
   public int jobid;
   
   // salary  variable is visible in Employee class only.
   private double salary;
   
   // The name variable is assigned in the constructor. 
   public Employee (String emptitle){
      jobtitle = emptitle;
   }
public Employee(int id){
	jobid=id;
}
   // The salary variable is assigned a value.
   public void setSalary(double empSal){
      salary = empSal;
   }
   
   // This method prints the employee details.
   public void printEmp(){
      System.out.println("title  : " + jobtitle );
      System.out.println("salary :" + salary);
      System.out.println("id:"+jobid);
   }

   public static void main(String args[]){
      Employee empOne = new Employee("Prathyusha");
      empOne.setSalary(10000);
      empOne.printEmp();
   }


}