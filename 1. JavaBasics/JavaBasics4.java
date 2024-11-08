import java.util.Scanner;
public class JavaBasics4 {
    public static void printHello() {
        System.out.println("Hello");
    }
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void primesInRange(int n) {
        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printHello();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The sum of two numbers is: " + sum);
        int product = calculateProduct(a, b);
        System.out.println("The product of two numbers is: " + product);
        System.out.print("Enter a number to calculate factorial: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("The factorial of " + n + " is: " + fact);
        if (isPrime(n)) System.out.println(n + " is a prime number.");
        else System.out.println(n + " is not a prime number.");
        primesInRange(n);
        sc.close();
    }
}
