import java.util.*;
public class Binary_Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Sorted in array");
        for(int i=0;i<n;i++){
            System.out.println("Enter Element["+i+"] in array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to be search::");
        int s=sc.nextInt();
       int ans=Search(s, arr);
       if(ans==-1){
        System.out.println("Element not found");
       }else{
        System.out.println("Element found at>>>"+ans);
       }
    }
    public static int Search(int a,int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(a==arr[middle]){
               return middle;
            }
            else if(a<arr[middle]){
                right=middle-1;
            }else{
                left=middle+1;
            }
        }
        return -1;
    }
}
