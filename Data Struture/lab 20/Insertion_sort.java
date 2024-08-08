import java.util.Scanner;

public class Insertion_sort{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter Elemnts in array??");
        int[] arr=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int i=0;
        while(i<n){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            i++;
        }
        for(int k=0;k<n;k++){
            System.err.print(arr[k]+",");
        }
    }

}