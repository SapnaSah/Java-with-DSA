public class conditional_operation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Conditional operation using ternary operator
        String result = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(result);

        // Using if-else statement
        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is not less than b");
        }
    }
}
