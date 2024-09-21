import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age<=0){
            System.out.println("Invalid age.");
        }
        else if (age >= 18){
            System.out.print("You are eligible to drive.😊😊");
        }
        else {
            System.out.print("You are not eligible to drive.");
        }

    }
}
