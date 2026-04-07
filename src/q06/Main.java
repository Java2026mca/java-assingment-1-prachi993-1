import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Print first n Fibonacci numbers separated by spaces
        //       F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2)
        //
        // Input: 8
        // Output: 0 1 1 2 3 5 8 13
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        if (n <= 0) return;

        long first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + (i == n - 1 ? "" : " "));

            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
