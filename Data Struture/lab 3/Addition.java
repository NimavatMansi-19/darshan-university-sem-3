import java.util.*;
public class Addition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st & 2nd");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ans=0;
        for(int i=m;i<=n;i++){
            ans=ans+i;
        }
        
            System.out.println("sum="+ans);
            
        
    }
}