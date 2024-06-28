import java.util.Scanner;

class Employee_Details{
    int Employee_ID;
    String name;
    String Designation;
    int Salary;
    Employee_Details(int Employee_ID,String name,String Designation,int Salary){
        this.Employee_ID=Employee_ID;
        this.name=name;
        this.Designation=Designation;
        this.Salary=Salary;
        System.out.println("Employee_Id="+this.Employee_ID);
        System.out.println("Name="+this.name);
        System.out.println("Designation="+this.Designation);
        System.out.println("Salary="+this.Salary);
    }
}
public class Employee_Detail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee id:");
        int id=sc.nextInt();
        System.out.println("Enter employee Name:");
        String Name=sc.next();
        System.out.println("Enter employee Designation:");
        String Des=sc.next();
        System.out.println("Enter employee Salary:");
        int Sal=sc.nextInt();
        Employee_Details e=new Employee_Details(id,Name,Des,Sal);
         
        
    }
    
}
