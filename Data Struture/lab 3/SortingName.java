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
    String min="";
    a[0]="Mansi";
    a[1]="Darshi";
    a[2]="Bhoomi";
    a[3]="Nandani";
    for(int i=0;i<2;i++){
      for(int j=0;j<a[i].length();j++){
         if(a[i].charAt(j)<a[i+1].charAt(j)){
            min=a[i];
         }
         else{
            min=a[i+1];
         }
         
         }
         }
      System.out.println(min); 
      }
      
    }
    


