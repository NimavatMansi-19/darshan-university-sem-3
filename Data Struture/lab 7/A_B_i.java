//Write a program to determine if an input character string is of the form aib
// i
// where i >= 1 i.e., Number of ‘a’ should be equal to number of ‘b’.

import java.util.Scanner;
class Menu{
    int top=-1;
    int max;
    char[] stack;
    Menu(int max){
        this.max=max;
        stack=new char[max];
    }
    public void Push(char x){
        if(top>=max-1){
            System.out.println("Stack OverFlow...");
        }else{
            top++;
            stack[top]=x;
        }
       
    }
}
public class A_B_i{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Menu A=new Menu(s.length());
        Menu B=new Menu(s.length());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                A.Push(s.charAt(i));
            }
            if(s.charAt(i)=='b'){
                B.Push(s.charAt(i));
            }
            if(s.charAt(i)!='a' && s.charAt(i)!='b'){
                return;
            }
        }
        if(A.top==B.top){
            System.out.println("Valid Pattern");
            return;
        }
            
        
    }
}