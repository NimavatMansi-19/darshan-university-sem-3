import java.lang.*;
import java.util.*;
public class Merge_sort {
    static int[] arr;
    static int[] b;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter Elemnts in array??");
         arr=new int[n];
         b=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        
        mergesort(0,n-1);
        for(int m=0;m<n;m++){
            System.out.print(arr[m]+",");
        }
    }
    public static  void mergesort(int low,int high){
        int mid=0;
        if(low<high){
            mid=(int)Math.floor((low+high)/2);
            mergesort(low, mid);
            mergesort(mid+1, high);
            merge(low,mid,high);
        }
    }
    public static  void merge(int low,int mid,int high){
        int h,i,j,k;
        i=0;
        h=low;
        j=mid+1;
        while(h<=mid && j<=high){
            if(arr[h]<=arr[j]){
                b[i]=arr[h];
                h++;
            }else{
                b[i]=arr[j];
                j++;
            }
            i++;
        }
        while(h<=mid){
            b[i++]=arr[h++];
        }
        while(j<=high){
            b[i++]=arr[j++];
        }
        int a=0;
        for(int x=low;x<=high;x++){
            arr[x]=b[a++];
        }
        
    }
}

