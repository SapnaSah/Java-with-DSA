import java.util.Scanner;

public class take_3_input_check_side_of_a_trangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the third side of the triangle: ");
        int side3 = sc.nextInt();

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The sides can form a triangle.");
        } else {
            System.out.println("The sides cannot form a triangle.");
        }

        sc.close();
    }
    
}
