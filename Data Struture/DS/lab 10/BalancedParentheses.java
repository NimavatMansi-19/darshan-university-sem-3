import java.util.*;

public class BalancedParentheses {
    
    // Custom Stack implementation using array
    static class CharStack {
        private char[] stackArray;
        private int top;
        
        public CharStack(int capacity) {
            stackArray = new char[capacity];
            top = -1;
        }
        
        public void push(char c) {
            if (top == stackArray.length - 1) {
                throw new StackOverflowError("Stack is full");
            }
            stackArray[++top] = c;
        }
        
        public char pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stackArray[top--];
        }
        
        public char peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return stackArray[top];
        }
        
        public boolean isEmpty() {
            return top == -1;
        }
        
        public boolean matches(char c) {
            if (isEmpty()) {
                return false;
            }
            char topChar = peek();
            return (topChar == '(' && c == ')') ||
                   (topChar == '[' && c == ']') ||
                   (topChar == '{' && c == '}');
        }
    }
    
    public static int isBalanced(String expression) {
        CharStack stack = new CharStack(expression.length());
        
        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (!stack.matches(c)) {
                    return 0;  // Mismatched brackets
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty() ? 1 : 0;  // Balanced if stack is empty
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of Test Cases: ");
        int T = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        int[] results = new int[T];
        
        for (int i = 0; i < T; i++) {
            String expression = scanner.nextLine().trim();
            results[i] = isBalanced(expression);
        }
        
        scanner.close();
        
        // Print results
        for (int result : results) {
            System.out.println(result);
        }
    }
}
