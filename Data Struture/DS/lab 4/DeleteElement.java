import java.util.*;
public class DeleteElement {
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the index where you want to delete element:");
        int j=sc.nextInt();
       int[] arr=new int[n-1];
       for(int i=0;i<n;i++){
        System.out.println("Enter Value in array");
        a[i]=sc.nextInt();
    }
       for(int i=0;i<a.length-1;i++){
        if(i<j){
            arr[i]=a[i];
        }
        else{
            arr[i]=a[i+1];
        }
        
        
       }
       System.out.println("Deleted Array");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
       }
    }
    
}
