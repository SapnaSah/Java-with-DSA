import java.util.Scanner;

public class length_breadth_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the length: ");
        int l = sc.nextInt();

        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();

        int area = l * b; // Declare and assign area

        if (l == b) {
            System.out.println("Yes, it's a square"); // ✅ Fixed semicolon
        } else {
            System.out.println("No, it's not a square");
        }

        System.out.println("Area: " + area);

        sc.close(); // Close the scanner
    }
}


