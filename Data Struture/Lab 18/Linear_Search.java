import java.util.Scanner;

public class Linear_Search{
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Element in array");
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
    public static int Search(int s,int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]==s){
                return  i;
            }  
            i++;
        }
        return  -1;
        
    }
}