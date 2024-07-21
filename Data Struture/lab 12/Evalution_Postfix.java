import java.util.*;

public class Evalution_Postfix{
    static Stack<Integer> s=new Stack<Integer>();
    public static int EvalPost(String str) {
        int value=0;
        String[] arr=str.split(",");
        for(int i=0;i<arr.length;i++){
                        //char temp=str.charAt(i);
            if(Character.isDigit(arr[i].charAt(0))){
                s.push(Integer.parseInt(arr[i]));
            }else{
                int op2=s.pop();
                int op1=s.pop();
                char temp=arr[i].charAt(0);
               // System.out.println(op1+","+op2);
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
        System.out.println("Enter comma sep>> value");
        String postfix = sc.nextLine();
       System.out.println( EvalPost(postfix));
    }
}