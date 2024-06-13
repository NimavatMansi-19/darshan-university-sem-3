import java.util.*;
public class ReadArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int a=sc.nextInt();
        int[] n=new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter"+i+"value");
            n[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            System.out.println("n["+i+"]="+n[i]);
            
        }
    }
}