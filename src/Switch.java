import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the case to print month: ");
        int month = input.nextInt();

        // Normal Switch case
//        switch(month){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Invalid choice!");

        // Enhance switch case, It doesn't require any break; statement
                switch (month) {
                    case 1 -> System.out.println("January");
                    case 2 -> System.out.println("February");
                    case 3 -> System.out.println("March");
                    case 4 -> System.out.println("April");
                    case 5 -> System.out.println("May");
                    case 6 -> System.out.println("June");
                    case 7 -> System.out.println("July");
                    case 8 -> System.out.println("August");
                    case 9 -> System.out.println("September");
                    case 10 -> System.out.println("October");
                    case 11 -> System.out.println("November");
                    case 12 -> System.out.println("December");
                    default -> System.out.println("Invalid choice!");
        }
    }
}
