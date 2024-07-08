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
    public void InsertAtRandom(int data){
        Node newNode = new Node(data);
        count++;
        if (first == null || data <= first.data) {
            newNode.link = first;
            first = newNode;
        } else {
            Node current = first;
            while (current.link!= null && data > current.link
            .data) {
                current = current.link;
            }
            newNode.link = current.link;
            current.link = newNode;
        } 

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
   
     public void CopyLL(){
        Node current = first;
        Node newHead = new Node(current.data);
        Node prev = newHead;
        System.out.print(prev.data+",");
        while(current != null && current.link != null) {
            current = current.link;
            Node newNode = new Node(current.data);
            prev.link = newNode;
            prev = newNode;
            System.out.print(prev.data+",");
        }
        first=first.link;
        System.err.println();
       System.out.println("List Copied....");
  }

    

    public void reverse(){
        // if(first==null ||first.link==null){
        //     return;
        // }
        Node prevNode=first;
        Node curNode=first.link;
        while(curNode!=null){
            Node nextNode=curNode.link;
            if(prevNode == first){
                prevNode.link=null;
            }
            curNode.link=prevNode;
            //update
            prevNode=curNode;
            curNode=nextNode;
        }
            //first.link=null;
            first=prevNode;
            System.out.println("Linked_List Reversed---->");
    }
    
    public void displayLL(){
        System.out.print("Your list consists of =>");
        Node temp = first;
        while (temp!=null) {
            System.out.print(temp.data+",");
            temp=temp.link;
        } 
        System.out.println();
    }

}
public class Linked_List{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LL node1=new LL();
       
        while (true) {
            System.out.println("Enter 1 to Insert At Start");
            System.out.println("Enter 2 to Insert At Odered list");
            System.out.println("Enter 3 to Insert At End");
            System.out.println("Enter 4 to Delete");
            System.out.println("Enter 5 to Display List");
            System.out.println("Enter 6 to Display numbers of node present in linked list:");
            System.out.println("Enter 7 to Reverse List");
            System.out.println("Enter 8 to copy list");
            System.out.println("Enter 9 to Exit");
            int a=sc.nextInt();
            int b;
            
                if(a==1){
                System.out.println("Enter number you want to add at first:");
                 b=sc.nextInt();
                node1.InsertAtStart(b);
                }
                if(a==2){
                System.out.println("Enter number you want to add in odered list:");
                 b=sc.nextInt();
                node1.InsertAtRandom(b);
                }
                if(a==3){
                System.out.println("Enter number you want to add at end:");
                 b=sc.nextInt();
                node1.InsertAtEnd(b);
                }
                if(a==4){
                 System.out.println("Enter number you want to delete particular element:");
                 b=sc.nextInt();
                node1.Delete(b);
                }
                if(a==5){
                node1.displayLL();
                }
                if(a==6){
                node1.CountNode();
                }
                if(a==7){
                    node1.reverse();
                }
                if(a==8){
                    node1.CopyLL();
                }
                if(a==9){
                    break;
                }
        }       
    }
}