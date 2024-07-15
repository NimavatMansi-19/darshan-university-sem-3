public class Polish_Noatation {
    static int top=-1;
     static String str="a+b*c-d/e*h";
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
     public static void revpol(String str){
        Push('(');
        char next;
        String Polish="";
        String string="";
        for(int i=str.length()-1;i>=0;i--){
           if(str.charAt(i)=='('){
               string=string+')';
           }else if(str.charAt(i)==')'){
               string=string+'(';
           }else{
               string=string+str.charAt(i);
           }
        }
        string=string+')';
        System.out.println(string);
        for(int i=0;i<string.length();i++){
            next=string.charAt(i);
           if(string.charAt(i)>='a' && string.charAt(i)<='z'){
            Polish=Polish+string.charAt(i);
            System.out.println("hi");
           }
           else{
            Push(next);
            while (Precedence(next)) {
                
            }
           System.out.println(Stack[top]);
           }
        }
    }
     public static void main(String[] args) {
        revpol("a+b*c-d/e*h");
     }
    
}
