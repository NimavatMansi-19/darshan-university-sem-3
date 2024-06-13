import java.util.*;
public class Position{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter"+i+"value");
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int max=a[0];
        int maxp=0,minp=0;
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
                minp=i;
            }
            if(max<a[i]){
                max=a[i];
                maxp=i;
            }

        }
        System.out.println("max position is:"+maxp);
        System.out.println("min position is:"+minp);
        
    }
}