public class MethodOverloading {
    public static void main(String[] args) {
        foo();
        foo(2);
    }
    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo(int a){
        System.out.println("How many cup tea you want "+a);
    }
}
