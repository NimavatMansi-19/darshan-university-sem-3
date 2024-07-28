import java.util.*;

public class ReverseBeforeVowel {
    
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public static String processString(int N, String S) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            char currentChar = S.charAt(i);
            
            if (isVowel(currentChar)) {
                // Reverse the part of the result before this vowel
                result.reverse();
            }
            
            result.append(currentChar);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int T = scanner.nextInt();  // Number of test cases
            scanner.nextLine();  // Consume newline after integer input
            
            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt();  // Length of the string
                scanner.nextLine();  // Consume newline after integer input
                String S = scanner.nextLine();  // The string itself
                
                String finalString = processString(N, S);
                System.out.println(finalString);
            }
        } catch (InputMismatchException e) {
            System.out.println("Input format error. Please provide valid input.");
        } finally {
            scanner.close();
        }
    }
}
