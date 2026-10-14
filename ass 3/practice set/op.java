import mathematics.*;
import java.util.*;

public class op {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        max m = new max();
        m.findMax(a, b);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        pow p = new pow();
        p.calculatePower(base, exponent);

        sc.close();
    }
}