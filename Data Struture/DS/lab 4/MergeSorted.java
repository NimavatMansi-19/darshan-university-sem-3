 import java.util.*;
public class MergeSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Value in array1");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Enter Value in array2");
            b[i]=sc.nextInt();
        }
                // Arrays.sort(a);
                // Arrays.sort(b);

                int[] ans=new int[(a.length+b.length)];
               int  index=0;
                while(index!=(a.length+b.length)){
                    if(index<5){
                    ans[index]=a[index];
                    index++;
                    }
                    else{
                        ans[index]=b[index-5];
                        index++;
                    }
                }
                System.out.print("[");
                for(int i=0;i<(a.length+b.length);i++){
                    System.out.print(ans[i]+",");
                }
                System.out.print("]");
        //System.out.println("Modified"+Arrays.toString(a)+Arrays.toString(b));
    }
    
}
