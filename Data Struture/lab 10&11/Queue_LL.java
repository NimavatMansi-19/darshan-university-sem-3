import java.util.Scanner;

/**
 * InnerStack_LL
 */
class Stack{
    class Node{
        int data;
        Node link;
        Node(int data){
            this.data=data;
            this.link=null;
            
        }
    }
   static Node top=null;
    Node first=null;
    public void Push(int data){
        Node new_node=new Node(data);
        if (first==null){
            first=new_node;
            return;
        }
        Node save=first;
        while (save.link!=null){
            save=save.link;
        }
        save.link=new_node;
        

        
    }
    public int Pop(){
        if(first==null){
            System.out.println("Stack Underflow");
        }else{
            first=first.link;
        }
        return first.data;
        
    }

    public void displaystack(){
        Node temp=first;
        while (temp!=null) {
            System.out.print(temp.data+",");
        temp=temp.link;
        } 
        System.out.println();   
    }
    
}
public class Queue_LL {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Stack s=new Stack();
    // s.Push(3);
    // s.Push(2);
    // s.Push(1);
    // s.Pop();
    // s.displaystack();
     while (true) {
        System.out.println("Enter 1 to Push");
        System.out.println("Enter 2 to Pop");
        System.out.println("Enter 3 to Display Stack");
        System.out.println("Enter 4 to Exit");
        int a=sc.nextInt();
        int b;
        if(a==1){
            System.out.println("Enter element you want to push in stack:");
             b=sc.nextInt();
            s.Push(b);
        }
        if(a==2){
            s.Pop();
        }
        if(a==3){
            s.displaystack();
        }
        if(a==4){
            break;
        }

         
    }
        
    
 }
}