import java.util.Scanner;
public class PatternPrinting{
    public static void printstar(int n){
        for(int i = 0;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedStar(int m){
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=m-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramid(int a){
        for(int i = 0;i<a;i++){
            for(int j = a-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = 0 ; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void halfPyramid(int b){
        for(int i = 0;i<=b;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void characterPattern(int c){
        char ch = 'A';
        for(int i = 0;i<=c;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.print("Enter the no. of rows for print star pattern :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printstar(n);
        System.out.print("Enter the no. of rows for print inverted star pattern :");
        int m = sc.nextInt();
        invertedStar(m);
        System.out.print("Enter the no. of rows for print pyramid :");
        int a = sc.nextInt();
        pyramid(a);
        System.out.print("Enter the no. of rows for print half pyramid :");
        int b = sc.nextInt();
        halfPyramid(b);
        System.out.print("Enter the no. of rows for print character pattern :");
        int c = sc.nextInt();
        characterPattern(c);
    }
}