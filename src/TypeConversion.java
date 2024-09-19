public class TypeConversion {
    public static void main(StringProgram[] args){

        // implicit type conversion (float->int)
        float myFloat = 5;
        System.out.println(myFloat);

        // explicit type conversion
        int myInt = (int)5.45f;
        System.out.println(myInt);
    }
}
