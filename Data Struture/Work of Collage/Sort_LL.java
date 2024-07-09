/**
 * InnerSort_LL
 */
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
    public void displayLL(){
        Node temp=first;
        System.out.print("Your list consists of =>");
        while (temp!=null) {
            System.out.print(temp.data+",");
        temp=temp.link;
        } 
        System.out.println();
    }
    public void Sort(){
        Node save=first.link;
        Node temp=first;
        first.link=save.link;
        save.link=temp.link;
        
    }

}
public class Sort_LL {
    public static void main(String[] args) {
        LL m=new LL();
        m.InsertAtStart(4);
        m.InsertAtStart(2);
        m.Sort();
        m.displayLL(); 
    }
    
    
    
}
