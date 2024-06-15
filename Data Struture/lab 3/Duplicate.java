import java.util.*;

public class Duplicate {
    public static void main(String[] args, int j2) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value of"+i);
            a[i]=sc.nextInt();
        }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        System.out.println("Duplicate");
                    }
                }
            }
        }
    }
    

