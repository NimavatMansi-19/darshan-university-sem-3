public class Polish_Notation_Linked_List {
    class Node{
        int data;
        Node link;
        Node(int data){
            this.data=data;
            this.link=null;
            
        }
    }
      Node top=null;
     Node first=null;
    public void Push(int data){
        Node new_node=new Node(data);
        if(first==null){
            first=new_node;
            return;
        }
        Node temp=first;
        first=new_node;
        first.link=temp;
   }
    public int Pop(){
        if(first==null){
            System.out.println("Stack Underflow");
        }
        first=first.link;
        return first.data;
       
       
        
    }

    public void displaystack(){
        while (first!=null) {
            System.out.print(first.data+",");
        first=first.link;
        } 
        System.out.println();   
    }
    public static int Input_Precedence(char n) {
        if(n=='+' || n=='-'){
            return 1;
        }else if(n=='*' || n=='/'){
            return 3;
        }
        else if(n=='^'){
            return 6;
        }
        else if(n=='('){
            return 9;
        }
        else if(n==')' ){
            return 0;
        }
        else{
            return 7;
        }      
    }
    public static int Stack_Precedence(char n) {
        if(n=='+' || n=='-'){
            return 2;
        }else if(n=='*' || n=='/'){
            return 4;
        }
        else if(n=='^'){
            return 5;
        }
        else if(n=='('){
            return 0;
        }
        else if(n==')' ){
            return 0;
        }
        else{
            return 8;
        }      
    }
    public static void Revpol(String str) {
        str=str+')';
       // System.out.println(str.length());
        Push('(');
        int Ranks=0;
        char next;
        String Polish="";
        for(int i=0;i<str.length();i++){
             next=str.charAt(i);
             //System.out.println(next);
            //  System.out.println(Stack_Precedence(Stack[top]));
            //System.out.println("top"+top);
            //System.out.println(Stack[i]);
            if(first==null){
                System.out.println("Invalid String>>>");
                return;
            }
            while (Stack_Precedence(first.data)>Input_Precedence(next)){
                //System.out.println(Input_Precedence(next));
               char temp=Pop();
                Polish=Polish+temp;
                //System.out.println("Polish"+Polish);
               // System.out.println(m.Rank(temp));
                Ranks=Ranks+Rank(temp);

               // System.out.println("gfhjgfjh"+Ranks);
             
             if(Ranks<1){
                System.out.println("Invalidsss");
                return;
             }
            } 
             if(Stack_Precedence(Stack[top])!=Input_Precedence(next)){
                Push(next);
             }else{
                Pop();
             }
            
            
        }

       //System.out.println(Ranks);
        if(top!=-1 && Ranks!=1 ){
             System.out.println("Invalid");
        }
        else{
            System.out.println("Polish::"+Polish);
            //System.out.println("Invalid");
        }
    
        }
    
}
