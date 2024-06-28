import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("original Numbers:"+a+","+b);
        Swap(a,b);
    }
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swaped Numbers:"+a+","+b);
    }
}