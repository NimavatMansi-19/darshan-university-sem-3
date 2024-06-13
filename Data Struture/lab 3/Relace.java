import java.util.*;
public class Relace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int f=sc.nextInt();
        System.out.println("Enter your number to be replaced");
        int n=sc.nextInt();
        System.out.println("Enter your number by what to be replaced");
        int m=sc.nextInt();
        int[] a=new int[f];
        for(int i=0;i<f;i++){
            System.out.println("Enter"+i+"value");
            a[i]=sc.nextInt();
        }
        
        int minp=0;
        for(int i=0;i<f;i++){
            if(a[i]==n){
               a[i]=m;
               minp=i;
            }
           

        }
        for(int i=0;i<f;i++){
            System.out.println("n["+i+"]="+a[i]);
            
        }
        
    }
}