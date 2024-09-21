import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value to find the factorial: ");
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.print("Factorial of "+num+" is: "+fact);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
        return n * factorial(n-1);
        }
    }
}
