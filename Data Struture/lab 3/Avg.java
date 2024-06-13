import java.util.*;
public class Avg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        
        int n=sc.nextInt();
        int ans=0;
        double avg=0;
        for(int i=1;i<=n;i++){
            ans=ans+i;
        }
            avg=ans/n;
            System.out.println("ans="+avg);
            
        
    }
}