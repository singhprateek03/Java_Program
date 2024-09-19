public class Parameter {
    public static void main(StringProgram[] args){
//        int num = sum(10,5);    // Argument -> (10,5)
//        System.out.println("The sum is: "+num);
        System.out.println("The sum is: "+sum(10,5));
    }

    public static int sum(int first, int second){  // Parameter -> (int first, int second)
        System.out.println("First number is: "+first);
        System.out.println("Second number is: "+second);
        int sum = first + second;
        return sum;
    }
}
