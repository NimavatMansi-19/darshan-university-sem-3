import java.util.*;
public class Anagram{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter string in array:");
            str[i]=sc.next();
        }
        
        int index=(int)(Math.random()*n);
        System.out.println(index);
        System.out.println("Enter word:");
        String word=sc.next();
        char[] c1=new char[word.length()];
        char[] c2=new char[word.length()];
        if(word.length()!=str[index].length()){
            System.out.println("Not Anagram");
        }else{
            c1=str[index].toCharArray();
            c2=word.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for(int i=0;i<c1.length;i++){
                if(c1[i]!=c2[i]){
                    System.out.println("Not Anagram");
                    return;
                }
            }
            System.out.println("Anagram");
            
        }

     }
}