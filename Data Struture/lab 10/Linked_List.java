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
    public void InsertAtRandom(int data){
        Node newNode = new Node(data);

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
            System.out.println("Data Not found");
 }

        
    }
    public void displayLL(){
        while (first!=null) {
            System.out.print(first.data+",");
        first=first.link;
        }    
    }

}
public class Linked_List{
    public static void main(String[] args) {
        LL node1=new LL();
        node1.InsertAtStart(2);
        node1.InsertAtStart(1);
        node1.InsertAtEnd(5);
        node1.InsertAtRandom(4);
        node1.Delete(2);
       // node1.Delete(9);
        node1.displayLL();
        
    }
}