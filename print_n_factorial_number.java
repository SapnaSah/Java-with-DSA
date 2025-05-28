import java.util.Scanner;
public class print_n_factorial_number {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact=fact* i; 
            System.out.println("Factorial of " + i + " is: " + fact);
}
 }
}
