/*
*Thise program simulates the working of singly linked list
* 1)Insert Node at Start
* 2)Insert Node At End
* 3)Insert Node in Odered List
*4)Count Node
*5)Delete Node
*6)Copy Linked List
*7)Reverse Linked List
* 8)Sort Linked List
* 9)Display Linked List
Author:MANSI
Date:XXXXX */
import java.util.Scanner;

class LL{
    class Node{
        int data;
        Node link;
        Node(int data){
            this.data=data;
            this.link=null;
            
        }
    }
    Node first=null;
    public void InsertAtStart(int data){
        
        Node new_node=new Node(data);
        if(first==null){
            first=new_node;
            return;
        }
        Node temp=first;
        first=new_node;
        first.link=temp;
        
    }
    int gcd;
    public void GCD(){
        
        Node save=first;
        Node temp=save.link;

        while (temp!=null) {
            int a=save.data;
           int b=temp.data;
            for(int i=1;i<=a && i<=b;i++){
                if(a%i==0 && b%i==0){
                    gcd=i;
                }
            }
            Node new_node=new Node(gcd);
            save.link=new_node;
            new_node.link=temp;
            save=save.link.link;
            temp=temp.link;

            
        }
        
        
    }
    public void Delete(int data){
        Node new_node=new Node(data);
        if(first==null){
            return;
        }
        if(first.data==data){
            first=first.link;
            return;
        }

        Node cur=first;
        while (cur!=null){
           // cur=cur.link;
            if(cur.link.data==data){
                cur.link=(cur.link).link;
                return;
            }
            
            cur=cur.link;
            

     }
 }
   
      public void displayLL(){
        Node temp=first;
        System.out.print("Your list consists of =>");
        while (temp!=null) {
            System.out.print(temp.data+",");
        temp=temp.link;
        } 
        System.out.println();
    }

}
public class GCD_Linked_list{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LL node1=new LL();
        int b;
        System.out.println("Which function you want to perform:");
        while (true) {
        System.out.println("Enter 1 to Insert At Start");
        System.out.println("Enter 2 to Insert GCD");
        System.out.println("Enter 3 to Display");
        System.out.println("Enter 4 to exit");
        b=sc.nextInt();
        if(b==1){
            System.out.println("Enter Element to be Insert");
            int c=sc.nextInt();
            node1.InsertAtStart(c);
        }    
        else if(b==2){
        node1.GCD();
        }else if(b==3){
        node1.displayLL();
        }
        else if (b==4){
            break;
        }
    }
             
    }
}