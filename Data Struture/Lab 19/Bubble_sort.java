
import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int last=n-1;
        for(int i=0;i<n-1;i++){
            int ex=0;
            for(int j=0;j<last;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    ex++;
                }
            }
            if(ex==0){
                //System.out.println("Array is sorted");
                break;
                
            }else{
                last--;
            } 
        }
        
        for(int i=0;i<n;i++){
            System.err.print(arr[i]+",");
        }
    }
}
