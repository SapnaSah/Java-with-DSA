import java.util.Scanner;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        // Use regular expression to split the string by all non-alphabetic characters
        String[] tokens = input.trim().split("[^A-Za-z]+");

        // Filter out any empty strings (edge case if input is empty or has leading/trailing punctuation)
        if (tokens.length == 1 && tokens[0].isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        
        sc.close();
    }
}


