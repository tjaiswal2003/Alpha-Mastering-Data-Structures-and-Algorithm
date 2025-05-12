import java.util.Scanner;
public class Recursion4 {
    // Tiling Problem: Find the number of ways to tile a 2xn floor using 2x1 tiles.
    public static int tilingProblem(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive calls
        // Vertical choice
        int fnm1 = tilingProblem(n - 1);
        // Horizontal choice
        int fnm2 = tilingProblem(n - 2);
        // Total ways to tile the 2xn floor
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    // Remove duplicates from a string 
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        // Base case: if we have processed all characters
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // Check if the character is already encountered
        if (map[currChar - 'a']) {
            // If duplicate, skip it and move to the next character
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // Mark the character as encountered
            map[currChar - 'a'] = true;
            // Append the character to the result
            newStr.append(currChar);
            // Recur for the next character
            removeDuplicates(str, idx + 1, newStr, map);
        }
    }
    public static int friendsPairing(int n) {
        // Base cases
        if (n == 1 || n == 2) {
            return n;
        }
        // Recursive calls
        // The friend can stay single
        int single = friendsPairing(n - 1);

        // The friend can pair up with any of the (n-1) remaining friends
        int paired = (n - 1) * friendsPairing(n - 2);

        // Total ways to pair up n friends
        return single + paired;
    }
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        // Base case: if the length of the string reaches n
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Recursively call for the next place with '0'
        printBinaryStrings(n - 1, 0, str + "0");

        // Recursively call for the next place with '1' if the last place was not '1'
        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        System.out.println("Number of ways to tile the 2x" + n + " floor: " + tilingProblem(n));

        StringBuilder result = new StringBuilder();
        boolean[] map = new boolean[26]; // Assuming the input string contains only lowercase letters a-z
        System.out.print("String after removing duplicates: ");
        removeDuplicates("banana", 0, result, map);
        System.out.println(result.toString());
        System.out.println(friendsPairing(n));
        printBinaryStrings(n, 0, "");
    }
}
