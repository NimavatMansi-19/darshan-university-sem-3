import java.util.Scanner;

class Menu{
    int top=-1;
    int max=5;
    int[] stack=new int[max];
    public void Push(int x){
        if(top>=max){
            System.out.println("Stack OverFlow...");
        }else{
            top++;
            stack[top]=x;
        }
        displaystack();
    }
    public int Pop(){
        if(top<=-1){
            System.out.println("Stack overflow...");
            return(0);
        }
        else{
            top--;
            return(stack[top+1]);
        }
    }
    public void Peep(int I){
        if(top-I+1<=-1){
            System.out.println("Stack overflow...");
        }
        else{
           System.out.println(stack[top-I+1]);
        }
    }
    public void Change(int i,int X){
        if(top-i+1<=-1){
            System.out.println("Stack overflow...");
        }
        else{
            stack[top-i+1]=X;
        }
    }
    public void displaystack(){
        for(int i=0;i<=top;i++){
        System.out.println(stack[i]);
        }
        
    }
    
}
public class Methods{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Menu m=new Menu();
        while (true) {
            System.out.println("Enter 1 to push in the Stack:");
            System.out.println("Enter 2 to pop the Stack:");
            System.out.println("Enter 3 to peep in the Stack:");
            System.out.println("Enter 4 to Change in the Stack:");
            //System.out.println("Enter 5 to display Stack:");
            System.out.println("Enter any number to Exit:");
            int a=sc.nextInt();
            if(a==1){
                System.out.println("Enter Element you want to push:");
                int n=sc.nextInt();
                m.Push(n);
            }else if(a==2){
                m.Pop();
            }else if(a==3){
                System.out.println("Enter index you want to find:");
                int i=sc.nextInt();
                m.Peep(i);
            }else if(a==4){
                System.out.println("Enter index and Element you want to Insert:");
                int i=sc.nextInt();
                int x=sc.nextInt();
                m.Change(i, x);
            }
            else{
                break;
            }

        }        
    }
}