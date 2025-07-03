import java.util.Scanner;
public class Buy_sell_stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of transactions: ");
        int n = sc.nextInt();
        int  maxProfit = 0;
        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each transaction: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxProfit += prices[i+1] - prices[i];
            }
        }
        System.out.println("The maximum profit from multiple transactions is: " + maxProfit);
    }
}
