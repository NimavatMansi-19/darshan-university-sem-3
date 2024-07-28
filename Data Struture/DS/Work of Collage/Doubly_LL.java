 class Doubly_LinkedList {
    class Node{
        int data;
        Node lptr;
        Node rptr;
        Node(int data){
            this.data=data;
            this.lptr=null;
            this.rptr=null;
        }
    }
    Node head;
    Node tail;
    Doubly_LinkedList(){
        this.head=null;
        this.tail=null;
    }
    public void Insert_At_First(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }else{
        new_node.rptr=head;
        head.lptr=new_node;
        head=new_node;
        }   
    }
    public void Insert_At_Last(int data){
        Node new_Node=new Node(data);
        if(tail==null){
            head=new_Node;
            tail=new_Node;
        }else{
            tail.rptr=new_Node;
            new_Node.lptr=tail;
            tail=new_Node;
        }  
    }
    public void Insert_At_Position(int data, int position) {
        Node new_Node = new Node(data);
        Node temp = head;
        int cur = 1;
        
        if (position == 1) {
            Insert_At_First(data); // Assuming Insert_At_First correctly sets head and lptr
        } else {
            while (temp != null && cur < position) {
                temp = temp.rptr;
                cur++;    
            }
            
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            
            new_Node.rptr = temp;
            new_Node.lptr = temp.lptr;
            
            if (temp.lptr != null) {
                temp.lptr.rptr = new_Node; // Link rptrious node's rptr to new_Node
            }
            
            temp.lptr = new_Node; // Link temp's lptr to new_Node
        }
    }
    public void deleteNode(int key) {
        Node temp = head;
        
        // Find the node with the given key
        while (temp != null && temp.data != key) {
            temp = temp.rptr;
        }
        if (temp == null) {
            System.out.println("Node with key " + key + " not found in the list.");
            return;
        }

        if (temp.lptr != null) {
            temp.lptr.rptr = temp.rptr; 
        } else {
            head = temp.rptr; 
        }
        
        if (temp.rptr != null) {
            temp.rptr.lptr = temp.lptr; 
        }
    }
     public void Display_DLL(){
        Node temp=head;
        //Node temp1=tail;
        System.out.println("Your Linked_List>>");
        while (temp!=null) {
                System.out.print(temp.data+",");
                temp=temp.rptr;
                
            
        }
        
    }
}
public class Doubly_LL {
    public static void main(String[] args) {
        Doubly_LinkedList DL=new Doubly_LinkedList();
        DL.Insert_At_First(3);
        DL.Insert_At_First(2);
        DL.Insert_At_Last(4);
        DL.Insert_At_Position(5,2);
        DL.deleteNode(2);
        DL.Display_DLL();
    }
}
    

    
