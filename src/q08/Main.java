import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Implement a stack using an array (no Java Stack class)
        //       Process n operations:
        //         PUSH x  → push integer x
        //         POP     → pop top, print it; if empty print "EMPTY"
        //         PEEK    → print top without removing; if empty print "EMPTY"
        //         SIZE    → print current number of elements
        //
        // Input:
        // 6
        // PUSH 10
        // PUSH 20
        // PEEK
        // POP
        // POP
        // POP
        //
        // Output:
        // 20
        // 20
        // 10
        // EMPTY
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            String op = sc.next().toUpperCase();

            switch (op) {
                case "PUSH":
                    int x = sc.nextInt();
                    stack[++top] = x;
                    break;

                case "POP":
                    if (top == -1) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(stack[top--]);
                    }
                    break;

                case "PEEK":
                    if (top == -1) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(stack[top]);
                    }
                    break;

                case "SIZE":
                    System.out.println(top + 1);
                    break;
            }
        }
    }
}
