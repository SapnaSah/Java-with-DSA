import java.util.Scanner;

public class re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        // Initialize the first row
        for (int i = 0; i < m; i++) {
            mat[0][i] = 1;
        }

        // Initialize the first column
        for (int i = 0; i < n; i++) {
            mat[i][0] = 1;
        }

        // Fill the rest of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                mat[i][j] = mat[i - 1][j] + mat[i][j - 1];
            }
        }

        System.out.print(mat[n - 1][m - 1]);
    }
}
