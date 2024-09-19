import java.util.Scanner;
public class RelationalOperator {
    public static void main(StringProgram[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age to check you are eligible for driving license: ");
        int age = input.nextInt();
        if (age <= 18){
            System.out.println("You are not eligible for driving license.");
        }
        else
            System.out.println("You are eligible for driving license.");
    }
}
