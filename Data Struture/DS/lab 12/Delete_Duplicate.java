import java.util.Scanner;

class Linked_List{
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
public void Del_Dup() {
   Node save=first;
   Node temp=save.link;
   while(temp.link!=null){
    if(save.data==temp.data){
        save=temp.link;
        temp=null;
    }
        //save=save.link;
        temp=save.link;
        
    
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
public class Delete_Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linked_List node1=new Linked_List();
        node1.InsertAtStart(13);
        node1.InsertAtStart(13);
        node1.InsertAtStart(6);
        node1.InsertAtStart(1);
        node1.InsertAtStart(1);
        node1.Del_Dup();
        node1.displayLL();
        
    //     int b;
    //     System.out.println("Which function you want to perform:");
    //     while (true) {
    //     System.out.println("Enter 1 to Insert At Start");
    //     System.out.println("Enter 2 to Swap Nodes");
    //     System.out.println("Enter 3 to Display");
    //     System.out.println("Enter 4 to exit");
    //     b=sc.nextInt();
    //     if(b==1){
    //         System.out.println("Enter Element to be Insert");
    //         int c=sc.nextInt();
    //         node1.InsertAtStart(c);
    //     }    
    //     else if(b==2){
    //     node1.Del_Dup();
    //     }else if(b==3){
    //     node1.displayLL();
    //     }
    //     else if (b==4){
    //         break;
    //     }
    // }
             
 
    }
    
}
