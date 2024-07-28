import java.util.*;
import java.lang.*;
public class SortingName{
 /**
 * @param args
 */
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // System.out.println("E");
    // int a=sc.nextInt();
    String[] a=new String[4];
    String temp;
    a[0]="Mansi";
    a[1]="Darshi";
    a[2]="Bhoomi";
    a[3]="Nandani";
    for(int i=0;i<a.length-1;i++){
      for(int j=0;j<a[i].length();j++){
         if(a[i][j]>a[i+1][j]){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
         }
         }
         }
      for(int i=0;i<a.length;i++){
         System.out.println(a[i]);
      }
      }
      
    }
    


