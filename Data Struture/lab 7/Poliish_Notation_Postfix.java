import java.util.*;
import java.lang.*;
class Methods{
    int top=0;
      String str="(a+b^c^d)*(e+f/d))";
    int max=str.length();
    char[] stack=new char[max];
   // stack[0]=str.charAt(0);
    public void Push(char x){
        if(top>=max){
            System.out.println("Stack OverFlow...");
        }else{
            top++;
            stack[top]=x;
        }
       
    }
    public char Pop(){
        if(top<=-1){
            System.out.println("Stack overflow...");
            return(0);
        }
        else{
            top--;
            return(stack[top+1]);
        }
    }
    public void displaystack(){
        for(int i=0;i<=top;i++){
        System.out.println(stack[i]);
        }
        
    }
//     static int i=0;
//    public  char NextChar() {
    
//     char next=str.charAt(i);
//     if(i<max){
//         next=str.charAt(i);    
//         i++;  
//     }
//     retu//rn next; 
//     }
    public int Input_Precedence(int n) {
        int f=0;
        if(n=='+' || n=='-'){
            f=1;
        }if(n=='*' || n=='/'){
            f=3;
        }
        if(n=='^'){
            f=6;
        }
        if(n>='a' || n<='z'){
            f=7;
        }
        if(n=='('){
            f=9;
        }
        if(n==')' ){
            f=0;
        }

        return f;
        
    }
    public int Stack_Precedence(int n) {
        int g=0;
        if(n=='+' || n=='-'){
            g=2;
        }if(n=='*' || n=='/'){
            g=4;
        }
        if(n=='^'){
            g=5;
        }
        if(n>='a' || n<='z'){
            g=8;
        }
        if(n=='('){
            g=0;
        }
        if(n==')' ){
            g=0;
        }

        return g;
        
    }
    public int Rank( char temp) {
        int r=0;
        switch (temp) {
            case '+':
                r=-1;
                break;
                case '-':
                r=-1;
                break;
                case '*':
                r=-1;
                break;
                case '/':
                r=-1;
                break;
                case '^':
                r=-1;
                break;
                case '(':
                r=0;
                break;
                case ')':
                r=0;
                break;
            default:
            r=1;
                break;
        } 
        return r;
        
    }
}

public class Poliish_Notation_Postfix {
    public static void main(String[] args) {
        Methods m=new Methods();
        String Polish="";
        int Ranks=0;
        // System.out.println(Ranks);
        
        m.Push('(');
        System.out.println(m.stack[m.top]);
        System.out.println(m.top);
        char next;
        // System.out.println("Next"+next);
        char temp;
        System.out.println("Nextp"+m.Stack_Precedence(m.stack[m.top]));
        // System.out.println("Nexts"+m.Input_Precedence(next));
       
        for(int i=0;i<m.str.length();i++){
            next=m.str.charAt(i);
            
            if(m.top<-1){
                System.out.println("Invalid Strng>>>>");
                return;
            }
            while (m.Stack_Precedence(m.stack[m.top])>m.Input_Precedence(next)){
                temp=m.Pop();
                Polish=Polish+temp;
                System.out.println(m.Rank(temp));
                Ranks=Ranks+m.Rank(temp);

                System.out.println("gfhjgfjh"+Ranks);
             
             if(Ranks<0){
                System.out.println("Invalidsss");
                return;
             }
            } 
             if(m.Stack_Precedence(m.stack[m.top])!=m.Input_Precedence(next)){
                m.Push(next);
             }else{
                m.Pop();
             }
            
            
        }

        System.out.println(m.top);
        if(m.top!=0 || Ranks!=1 ){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Valid");
        }
        System.out.println(Polish);
            }
}