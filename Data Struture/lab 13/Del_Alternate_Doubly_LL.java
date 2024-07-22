//73. WAP to delete alternate nodes of a doubly linked list.
class Doubly_LL{
    class Node{
        int data;
        Node lptr;
        Node rptr;
        Node(int data){
            this.data=data;
            this.lptr=lptr;
            this.rptr=rptr;
        }
    }
    Node first=null;
    Node Last=null;
    public void Insert_At_End(int data){
        Node new_node=new Node(data);
        if(first==null){
            first=new_node;
            Last=new_node;
        }
        else{
            Last.rptr=new_node;
            new_node.lptr=Last;
            Last=new_node;

        }
    }
    public void Del_Alt() {
        Node current = first;
        while (current != null && current.rptr != null) {
            Node linkNode = current.rptr;
            current.rptr = linkNode.rptr;
            if (linkNode.rptr != null) {
                linkNode.rptr.lptr = current;
            }
            current = current.rptr; // Move to the link node
        }
    }

    public void Display_DLL(){
        if(first==null){
           System.out.println("Empty LL");
        }
        Node cur=first;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.rptr;
            
        }
       
        
    }
    
}

public class Del_Alternate_Doubly_LL {
public static void main(String[] args) {
   Doubly_LL LL=new Doubly_LL();
   LL.Insert_At_End(6);
   LL.Insert_At_End(5);
   LL.Insert_At_End(4);
   LL.Insert_At_End(3);
   LL.Insert_At_End(2);
   LL.Insert_At_End(1);
   LL.Del_Alt();
   LL.Display_DLL(); 
}
}