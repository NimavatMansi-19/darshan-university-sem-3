import java.util.Scanner;

    class Student_Details{
        int Enroll_no;
        String name;
        int sem;
        double Cpi;
        Student_Details(int Enroll_no,String name,int sem,double Cpi){
            this.Enroll_no=Enroll_no;
            this.name=name;
            this.sem=sem;
            this.Cpi=Cpi;
            System.out.println("Enrollment number:="+this.Enroll_no);
            System.out.println("Name:="+this.name);
            System.out.println("Semester:="+this.sem);
            System.out.println("Cpi="+this.Cpi);
        }
    }
    public class Student {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Student_Details[] st=new Student_Details[5];
            for(int i=0;i<5;i++){
                System.out.println("Enter Enrollment number:");
                int no=sc.nextInt();
                System.out.println("Enter Name:");
                String name=sc.next();
                System.out.println("Enter Semester:");
                int semester=sc.nextInt();
                System.out.println("Enter Cpi:");
                double result=sc.nextDouble();
                st[i] = new Student_Details(no,name,semester,result);
            }
      
             
            
        }
        
    }

