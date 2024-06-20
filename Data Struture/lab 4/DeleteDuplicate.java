import java.util.*;
public class DeleteDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Value in array");
            a[i]=sc.nextInt();
        }  
        
        int k=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    k=j;
                    count++;
                }
            }
            
        }
        System.out.println(count);
        int[] arr=new int[(n-count)];
        for(int i=0;i<arr.length;i++){
            if(i<=k){
                arr[i]=a[i];
            }
            else{
                arr[i]=a[i+1];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
            
        }

    }
    
}
