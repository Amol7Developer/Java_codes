public class StringMethod20 {
     public static void main(String[] args) {
        String myStr = "Hello";
        
    //The startsWith() method checks whether a string starts with the specified character(s).
    //Tip: Use the endsWith() method to check whether a string ends with the specified character(s).

        System.out.println("Java String startsWith() Method used");
        
        System.out.println(myStr.startsWith("Hel")); //true
        System.out.println(myStr.startsWith("llo")); //false
        System.out.println(myStr.startsWith("o")); //false
  }
}