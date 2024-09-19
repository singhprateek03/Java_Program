import java.lang.String;
import java.util.Scanner;
public class StringProgram {
        public static void main(String[] args) {
//            String message = "Hello, World!";
//            System.out.println(message);      // println creates new line after printing a message.
//            System.out.print(message);        // print doesn't creates any extra white space after printing a message.

            int a = 10;
            float b = 25.26f;
            // printf and format both works are same
//            System.out.printf("The value of a is %d and b is %.2f",a,b);
//            System.out.format("\nThe value of a is %d and b is %f",a,b);
            Scanner input = new Scanner(System.in);
            String name = input.next();     // yeah space ke baad ke string ko print nhi karta
            System.out.println(name);

//            String name2 = input.nextLine();    // yeah puri string ko print karta hai
//            System.out.println(name2);
        }
}
