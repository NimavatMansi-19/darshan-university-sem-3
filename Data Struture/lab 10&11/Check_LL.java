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
    public void InsertAtStart(int data){
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

    public void displaystack(){
        Node temp=first;
        while (temp!=null) {
            System.out.print(temp.data+",");
        temp=temp.link;
        } 
        System.out.println();   
    }
    
}
public class Check_LL {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Stack LL1=new Stack();
     while (true) {
        System.out.println("Enter 1 to Insert At Start");
        System.out.println("Enter 2 to Display Stack");
        System.out.println("Enter 3 to Exit");
        int a=sc.nextInt();
        int b;
        if(a==1){
            System.out.println("Enter element you want to push in stack:");
             b=sc.nextInt();
            LL1.InsertAtStart(b);
        }
        if(a==2){
            LL1.displaystack();
        }
        if(a==3){
            System.out.println(LL1.first.data);
            break;
        }
    }
    Stack LL2=new Stack();
    while (true) {
        System.out.println("Enter 1 to Insert At Start");
        System.out.println("Enter 2 to Display Stack");
        System.out.println("Enter 3 to Exit");
        int a=sc.nextInt();
        int b;
        if(a==1){
            System.out.println("Enter element you want to push in stack:");
             b=sc.nextInt();
            LL2.InsertAtStart(b);
        }
        if(a==2){
            LL2.displaystack();
        }
        if(a==3){
            System.out.println(LL2.first.data);
            break;
        }
    }
    while (LL1.first!=null && LL2.first!=null){
       
         if(LL1.first.data!=LL2.first.data){
             System.out.println("Not Same Linked List>>>");
         }else{
             LL1.first=LL1.first.link;
            LL2.first=LL2.first.link;
             return;
         }
        
     }
     System.out.println("Same LL...");
 } 
}