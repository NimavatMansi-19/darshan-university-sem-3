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
        Node Last=null;
        public void Insert_Start(int data){
           Node new_node=new Node(data);
           if(first==null){
            new_node.link=new_node;
            first=Last=new_node;
           }
           else{
            new_node.link=first;
            Last.link=new_node;
            first=new_node;
           }
          // System.out.println(Last.data);
            
        }
        public void Insert_End(int data){
            Node new_node=new Node(data);
            if(first==null){
             new_node.link=new_node;
             first=Last=new_node;
            }
            else{
            Last.link=new_node;
            new_node.link=first;
            Last=new_node;
            }
           // System.out.println(Last.data);
             
         }
         public void Insert_Odered(int data){
            Node new_node=new Node(data);
            Node save=first;
            if(first==null){
                new_node.link=new_node;
                first=Last=new_node;
            }
            while (save!=Last && new_node.data>=save.link.data) {
                save=save.link;
            }
            new_node.link=save.link;
            save.link=new_node;
            
            if(save==Last){
                Last.link=new_node;
                new_node.link=first;
                Last=new_node;
            }

            
         }
         public void Delete(int data){
            Node save=first;
            if(first.data==data){
                Last.link=first.link;
                first=first.link;
            }
            
            while (save.link.data!=data){
                save=save.link;
            }
            if(Last.data==data){
              save.link=first;
              Last=save;  
                
            }
            
            save.link=save.link.link;
            save=save.link.link;

            
         }
        public void Display(){
            Node temp=first;
        
            if(temp==null){
                System.out.println("Empty Linked List");
            }
            while (temp!=Last){
                System.out.print(temp.data+",");
                temp=temp.link;  
            }
            System.out.print(Last.data);
            
        }

    }

/**
 * Circular_LL
 */
public class Circular_LL {

    public static void main(String[] args) {
        LL node=new LL();
        
        node.Insert_Start(2);
        node.Insert_Start(1);
        node.Insert_End(4);
        node.Insert_End(5);
        node.Insert_Odered(3);
        node.Delete(3);
        node.Delete(5);
        node.Display();
    }
}