import java.util.*;
public class InsertIntoSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elememt");
        int b=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("Enter  Value in array");
            a[i]=sc.nextInt();
        }  
        
        int[] arr=new int[n+1];
        int i=0;
        while (i<a.length && i<b) {
            arr[i]=a[i];
            i++;
            
        }
        arr[i]=b;
        i++;
        while (i<arr.length) {
            arr[i]=a[i-1];
            i++;
            
        }
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
            
        }
         
    }
    
}
