import java.util.Scanner;

public class Selection_sort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.err.print(arr[i]+",");
        }
    }
}
