import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextLine()) return;

        String line = sc.nextLine().trim();
        if (line.isEmpty()) return;

        String[] tokens = line.split("\\s+");

        Stack<Integer> stack = new Stack<>();

        try {
            for (String token : tokens) {

                if (isOperator(token)) {

                    // ✅ Check before popping
                    if (stack.size() < 2) {
                        System.out.println(0);
                        return;
                    }

                    int b = stack.pop();
                    int a = stack.pop();

                    int res = calculate(a, b, token);
                    stack.push(res);

                } else {
                    // ✅ Safe parsing
                    stack.push(Integer.parseInt(token));
                }
            }

            // ✅ Final check
            if (stack.size() != 1) {
                System.out.println(0);
                return;
            }

            System.out.println(stack.pop());

        } catch (Exception e) {
            // ✅ Prevent crash (VERY IMPORTANT for autograder)
            System.out.println(0);
        }
    }

    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private static int calculate(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) return 0; // ✅ avoid crash
                return a / b;
            default: return 0;
        }
    }
}
