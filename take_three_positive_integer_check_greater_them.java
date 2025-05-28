import java.util.Scanner;
public class take_three_positive_integer_check_greater_them {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second num:");    
        int num2 = sc.nextInt();
        System.out.println("Enter the third num:");
        int num3 = sc.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("first" + " is the greatest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("second"+ " is the greatest number.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("third"+ " is the greatest number.");
        } else {
            System.out.println("There is no single greatest number among the three.");
        }
        
        sc.close();
    }
}
