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
    static int count=0;
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
        count++;
        Node new_node=new Node(data);
        if(first==null){
            first=new_node;
            return;
        }
        Node temp=first;
        first=new_node;
        first.link=temp;
        
    }

    public void InsertAtEnd(int data){
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
        count++;

        
    }
    public void CountNode(){
       System.out.println(count); 
    }
    public void Delete(int data){
        Node new_node=new Node(data);
        if(first==null){
            return;
        }
        if(first.data==data){
            first=first.link;
            count--;
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
   
    

 public void Swap_K(int k){
    Node temp=first;
    Node x=first;
    int con=1;
    int i=1;
     while(count-con>=k){
         x=x.link;
         con++;
     } 
     while (i<k){
        temp=temp.link;
        i++;
     }
     int re=temp.data;
     temp.data=x.data;
     x.data=re;
     //System.out.println(temp.data);
     //System.out.println(x.data);   
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
public class Swap_K_Node{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LL node1=new LL();
        node1.InsertAtStart(5);
        node1.InsertAtStart(4);
        node1.InsertAtStart(3);
        node1.InsertAtStart(2);
        node1.InsertAtStart(1);
        node1.Swap_K(3);
        node1.displayLL();
       
        // while (true) {
        //     System.out.println("Enter 1 to Insert At Start");
        //     System.out.println("Enter 4 to Delete");
        //     System.out.println("Enter 5 to Display List");
        //     System.out.println("Enter 6 to Display numbers of node present in linked list:");
        //     System.out.println("Enter 9 to Exit");
        //     int a=sc.nextInt();
        //     int b;
            
        //         if(a==1){
        //         System.out.println("Enter number you want to add at first:");
        //          b=sc.nextInt();
        //         node1.InsertAtStart(b);
        //         }
                
        //         if(a==4){
        //          System.out.println("Enter number you want to delete particular element:");
        //          b=sc.nextInt();
        //         node1.Delete(b);
        //         }
        //         if(a==5){
        //         node1.displayLL();
        //         }
        //         if(a==6){
        //         node1.CountNode();
        //         }  
        //            if(a==9){
        //             break;
        //         }
        // }  
            }
}