import java.util.*;
public class InsertElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the index of array where you want to enter element");
        int j=sc.nextInt();
        System.out.println("Enter the elememt");
        int b=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter Value in array");
            a[i]=sc.nextInt();
        }  
        // if(j>n){
        //     int[] arr=new int[j];
        // } else{
        //     int[] arr=new int[n];
        // }
        int[] arr=new int[n+1];
        for(int i=0;i<arr.length;i++){
            if(i<j){
                arr[i]=a[i];
            }
            else if(i==j){
                arr[i]=b;
            }
            else {
                arr[i]=a[i-1];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
     }
}