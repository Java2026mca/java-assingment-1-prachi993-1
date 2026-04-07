import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Compute area using the correct formula
        //
        //   circle    r         → area = π * r * r          (use Math.PI)
        //   rectangle l w       → area = l * w
        //   triangle  a b c     → Heron's formula: s=(a+b+c)/2, area=sqrt(s(s-a)(s-b)(s-c))
        //
        // Print: "Area: X.XX"  (exactly 2 decimal places)
        //
        // Input: circle 7      → Output: Area: 153.94
        // Input: rectangle 4 6 → Output: Area: 24.00
        // Input: triangle 3 4 5→ Output: Area: 6.00
        if (!sc.hasNext()) return;
        String shape = sc.next().toLowerCase();
        double area = 0;

        switch (shape) {
            case "circle":
                double r = sc.nextDouble();
                area = Math.PI * r * r;
                break;
            case "rectangle":
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                area = l * w;
                break;
            case "triangle":
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                double s = (a + b + c) / 2.0;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
        }

        System.out.printf("Area: %.2f\n", area);
    }
}
