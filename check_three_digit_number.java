import java.util.Scanner;
public class check_three_digit_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        if (number >= 100 && number <= 999) {
            System.out.println("The number is a three-digit number.");
        } else {
            System.out.println("The number is not a three-digit number.");
        }
        
        sc.close();
    }
        
}
