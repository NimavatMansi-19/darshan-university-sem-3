import java.util.*;
public class Pascal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value upto which you want to print pascal triangle");
        int a=sc.nextInt();
        for(int l=1;l<=a;l++){
            for(int s=1;s<=(a-l);s++){
                System.out.print(" ");
            }
            int ans=1;
            for(int i=1;i<=l;i++){
                System.out.print(ans+" ");
                ans=ans*(l-i)/i;
            }
            System.out.println();
        }
        
    }
}