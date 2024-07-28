public class Polish_Notation_Postfix_and_Prefix {
    static int top=-1;
    static String str="a+b*c-d/e";
   static int max=str.length()+2;
     static char[] Stack=new char[max];
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
    public static int Precedence(char n) {
        if(n=='+' || n=='-'){
            return 1;
        }else if(n=='*' || n=='/'){
            return 3;
        }
        else if(n=='^'){
            return 6;
        }
        else{
            return 0;
        } 
    }
    public static void Revpol(String str) {
        str=str+')';
       // System.out.println(str.length());
        Push('(');
        char next;
        String Polish="";
        char temp;
        if(top<-1){
            System.out.println("Invalid String>>>");
            return;
        }
       for(int i=0;i<str.length();i++){
        next=str.charAt(i);
        // System.out.println(top);
        // System.out.println(next);
       // System.out.println(Precedence(Stack[top]));
       if(next>='a' && next<='z'){
        System.out.println("HHi");;
       }else{
        System.out.println(Stack[top]);
        System.out.println(next);
        System.out.println(Precedence(Stack[top]));
        System.out.println(Precedence(next));
       while (Precedence(next)<Precedence(Stack[top])){
        System.out.println("yup");
        
       }
        Push(next);
       

       // }
       }
        
        
                     
    //         // System.out.println(Precedence('('));
    //          while(Precedence(Stack[top])>Precedence(next)){
    //             System.out.println("hello");
    //          }
    //          Push(next);
    //          System.out.println("hi");
    //         // System.out.println(top);
    //          //System.out.println(Precedence(Stack[top]));  
    //     //     if(next>='a' || next<='z'){
    //     //        // Polish=Polish+next;
    //     //        System.out.println("hello");
    //     //     }
    //     //     else{
    //     //          while(Precedence('(')>=Precedence('+')){
    //     //             System.out.println("Hi");
    //     //         //     temp=Pop();
    //     //         //     Polish=Polish+temp;
    //     //         // }
    //     //         //  if(Stack[top]==')'){
    //     //         //     while (Stack[top]!='('){
    //     //         //         temp=Pop();
    //     //         //     Polish=Polish+temp;  
    //     //         //      }
    //     //         //      Pop();
    //     //          }
    //     //         Push(next);   
    //     //     }
    //     //    // System.out.println(Stack[top]);
    //     }
    //    // System.out.println(Polish);
    }
}

        public static void main(String[] args) {
            Revpol("a+b*c-d/e");
        }
        
}



