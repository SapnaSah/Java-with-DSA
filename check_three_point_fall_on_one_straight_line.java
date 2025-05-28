import java.util.Scanner;
public class check_three_point_fall_on_one_straight_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the coordinates of the first point (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        System.out.println("Enter the coordinates of the second point (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        System.out.println("Enter the coordinates of the third point (x3 y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        
        // Check if the points are collinear using the area of triangle method
        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y3 - y2) / (x3 - x2);
        
        if (m1 == m2) {
            System.out.println("The three points fall on one straight line.");
        } else {
            System.out.println("The three points do not fall on one straight line.");
        }
        
        sc.close();
    }
    
}
