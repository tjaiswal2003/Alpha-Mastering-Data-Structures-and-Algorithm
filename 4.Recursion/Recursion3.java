import java.util.Scanner;
public class Recursion3 {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        int x = s.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = s.nextInt();

        int result = power(x, n);
        int result1 = optimizedPower(x, n);

        System.out.println(x + " to the power of " + n + " (normal recursion) is: " + result);
        System.out.println(x + " to the power of " + n + " (optimized recursion) is: " + result1);
        
    }
}
