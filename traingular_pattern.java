import java.util.Scanner;

public class traingular_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Generate the star pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }    
         }
}
