import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no.");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no.");
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum of " + a + " and " + b + " is : " + sum);
        System.out.println("Product of " + a + " and " + b + " is : " + product);
        System.out.print("Enter radius to calculate the area of circle : ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println("Area of the cicle is :" + area);
        // float a = 12.25f;
        // int b = int(a);
        // System.out.println("The value of b after Typecasting :" +b);
    }
}
