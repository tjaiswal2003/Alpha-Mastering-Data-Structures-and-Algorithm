import java.util.Scanner;
public class Recursion {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    public static int fact(int m) {
        if (m == 0 || m == 1) {
            return 1;
        } else {
            return m * fact(m - 1);
        }
    }

    public static int sum(int p) {
        if (p == 1 || p == 0) {
            return p;
        } else {
            return p + sum(p - 1);
        }
    }

    public static int fib(int q) {
        if (q == 0 || q == 1) {
            return q;
        } else {
            return fib(q - 1) + fib(q - 2);
        }
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number to print in descending order:");
        int n = s.nextInt();
        printDec(n);

        System.out.println("Enter a number to calculate factorial:");
        int m = s.nextInt();
        System.out.println(fact(m));

        System.out.println("Enter a number to calculate the sum:");
        int p = s.nextInt();
        System.out.println(sum(p));

        System.out.println("Enter a number to print Fibonacci:");
        int q = s.nextInt();
        System.out.println(fib(q));
        
        System.out.println("Enter the size of the array:");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        if (isSorted(arr, 0)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
