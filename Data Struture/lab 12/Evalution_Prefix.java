import java.util.*;

public class Evalution_Prefix{
    static Stack<Integer> s=new Stack<Integer>();
    public static int EvalPost(String str) {
        int value=0;
        String[] arr=str.split(",");
        for(int i=arr.length-1;i>=0;i--){
            //char temp=str.charAt(i);
            if(Character.isDigit(arr[i].charAt(0))){
                s.push(Integer.parseInt(String.valueOf(arr[i])));
            }else{
                int op1=s.pop();
                int op2=s.pop();
                char temp=arr[i].charAt(0);
                //System.out.println(op1+","+op2);
                switch (temp) {
                    case '+':
                        value=op1+op2;
                        break;
                        case '-':
                        value=op1-op2;
                        break;
                        case '*':
                        value=op1*op2;
                        break;
                        case '/':
                        value=op1/op2;
                        break;
                        case '^':
                        value=(int) Math.pow(op1, op2);
                        break;
               }
              // System.out.println(value);
               s.push(value);
            }
        }

        return (s.pop());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your comma sep>> String");
        String prefix = sc.nextLine();
       System.out.println( EvalPost(prefix));
    }
}