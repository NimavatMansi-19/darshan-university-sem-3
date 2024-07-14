public class Pilosh_Notation_PostFix {
   static int top=-1;
    static String str="a+b*c-d/e*h";
   static int max=str.length();
     static char[] Stack=new char[max+1];
    public static void Push(char x){
        if(top>=max-1){
            System.out.println("Stack OverFlow...");
        }else{
            top++;
            Stack[top]=x;
        }
       
    }
    public static char Pop(){
        if(top<=-1){
            System.out.println("Stack overflow...");
            return(0);
        }
        else{
            top--;
            return(Stack[top+1]);
        }
    }
    public static int Rank(char c){
        if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
            return -1;
        }
        else if(c=='(' || c==')'){
        return 0;
        }
        else{
            return 1;
        }
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
            if(top<-1){
                System.out.println("Invalid String>>>");
                return;
            }
            while (Stack_Precedence(Stack[top])>Input_Precedence(next)){
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
        public static void main(String[] args) {
            Revpol("a+b*c-d/e*h");
        }
        
}

