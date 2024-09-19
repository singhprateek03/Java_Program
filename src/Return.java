import java.util.Scanner;
public class Return {
    public static void main(StringProgram[] args) {
        int firstNum = readNumber();
        int secondNum = readNumber();
        int sum = firstNum + secondNum;
        System.out.println("The sum is : "+sum);
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int number = input.nextInt();
        return number;
    }
}
