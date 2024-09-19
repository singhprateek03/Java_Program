public class Array {
    public static void main(StringProgram[] args){
//        int[] myArr = new int[5];
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        int[] myArr = {98, 2, 8, 65, 37};
        // Array Traversal
        int index = 0;
        while(index < myArr.length){    // (myArr.length) -> yeah array ki maximum length batayega
            System.out.println(myArr[index]);
            index++;
        }
    }
}
