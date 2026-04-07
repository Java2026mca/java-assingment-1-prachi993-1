import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int val = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (val <= n * n) {
            for (int i = left; i <= right && val <= n * n; i++) {
                matrix[top][i] = val++;
            }
            top++;

            for (int i = top; i <= bottom && val <= n * n; i++) {
                matrix[i][right] = val++;
            }
            right--;

            for (int i = right; i >= left && val <= n * n; i--) {
                matrix[bottom][i] = val++;
            }
            bottom--;

            for (int i = bottom; i >= top && val <= n * n; i--) {
                matrix[i][left] = val++;
            }
            left++;
        }

        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + (j == n - 1 ? "" : " "));
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal: " + diagonalSum);
    }
                    }
