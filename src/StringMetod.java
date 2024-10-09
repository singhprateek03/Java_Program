public class StringMetod {
    public static void main(String[] args) {

        String name = "Prateek";
        System.out.println(name);

        // 1) name.length() method
//        int length = name.length();
//        System.out.println(length);

        // 2) name.toLowerCase() method
//        String Lower = name.toLowerCase();
//        System.out.println(Lower);

        // 3) name.toUpperCase() method
//        String upper = name.toUpperCase();
//        System.out.println(upper);

        // 4) name.trim() method    // trim string ke starting and ending main jo bhi extra space honge usse hata deta hai
//        String nonTrimmedstring = "  Hello   world  !   ";
//        String trim = nonTrimmedstring.trim();
//        System.out.println(trim);

        // 5) name.substring(int start)  // substring main hum jo value denge uss index se string print hogi
//        System.out.println(name.substring(2));

        // 6) name.substring(int start, int end)
//        System.out.println(name.substring(2,7));

        // 7) name.replace() method
//        System.out.println(name.replace("ee", "i"));

        // 8) name.startWith() method
//        System.out.println(name.startsWith("P"));

        // 9) name.endsWith() method
//        System.out.println(name.endsWith("k"));

        // 10) name.charAt() method  // yeah 1-1 charcter ko nayi line print karta hai OR index pe konsa character wo batata hai
//        System.out.println(name.charAt(3));

        // 11) name.indexOf() method    // yeah batata hai ki given character ka sabse phele alphabet charater kis index pe hai
//        System.out.println(name.indexOf("e"));
//        System.out.println(name.indexOf("t",2)); // yeah batata hai ki given character ko dhundhna suru karo given index value ke baad se

        // 12) name.lastIndexOf() method       // yeah check karega ki string main last time given character kis index pe hai.
//        System.out.println(name.lastIndexOf("e"));
//        System.out.println(name.lastIndexOf("e", 3));   // yeah peche se check karta hai ki given charcter kis index pe hai

        // 13) name.equals() method
//        System.out.println(name.equals("Pratee"));

        // 14 name.equalsIgnoreCase() method    // yeah string ki spelling ko compare karta hai chache string lower case ho yaa upper case
        System.out.println(name.equalsIgnoreCase("prateEk"));
    }
}
