import java.util.Scanner;

public class Temperature {
    public static void Celsius(double a){
        double temp=(a-32)*5/9;
        System.out.println("Celsius="+temp);
    }
    public static void Fahrenhit(double a){
        System.out.println("Fahrenhit="+(a+32)*(9/5));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter c if you want to changer Fahrenhit to celsius and f if you want to change celsius to Fahrenhit:");
        String c=sc.nextLine();
        System.out.println("Enter Temperature:");
        double a=sc.nextDouble();
        if(c.equals("c")){
            Celsius(a);
        }
        if(c.equals("f")){
            Fahrenhit(a);
        }
    }
    
}
