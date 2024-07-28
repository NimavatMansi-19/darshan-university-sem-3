import java.util.Scanner;

    class Bank_Holder{
        int Act_no;
        int Balance;
        String ActHold;
        String name;

        Bank_Holder(int Act_no,int Balance, String ActHold, String name,){
            this.Act_no=Act_no;
            this.Balance=Balance;
            this.ActHold=ActHold;
            this.name=name;
            System.out.println("Act number:="+this.Act_no);
            System.out.println("Balance:="+this.Balance);
            System.out.println("ActHold:="+this.ActHold);
            System.out.println("name="+this.name);
        }
    }
    public class Bank{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Bank_Holder[] st=new Bank_Holder[5];
            for(int i=0;i<5;i++){
                System.out.println("Enter Enrollment number:");
                int no=sc.nextInt();
                System.out.println("Enter Name:");
                int bal=sc.next();
                System.out.println("Enter Semester:");
                String semester=sc.nextInt();
                System.out.println("Enter Cpi:");
                double result=sc.nextDouble();
                st[i] = new Student_Details(no,name,semester,result);
            }
      
             
            
        }
        
    }

