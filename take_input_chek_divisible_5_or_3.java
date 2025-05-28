import java.util.Scanner;
public class take_input_chek_divisible_5_or_3 {
    public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    if (number % 5 == 0 && number % 3 == 0) {
        System.out.println("The number is divisible by both 5 and 3.");
    } else if (number % 5 == 0) {
        System.out.println("The number is divisible by 5.");
    } else if (number % 3 == 0) {
        System.out.println("The number is divisible by 3.");
    } else {
        System.out.println("The number is not divisible by either 5 or 3.");
    }
}
}