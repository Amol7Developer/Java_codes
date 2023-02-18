public class StringMethod12 {
    public static void main(String[] args) {
    String myStr1 = "Hello";
    String myStr2 = "Hello";
    String myStr3 = "Another String";

//The equals() method compares two strings, and returns true if the strings are equal, and false if not.
//Tip: Use the compareTo() method to compare two strings lexicographically.
  
     System.out.println("Java String equals() Method used");

    System.out.println(myStr1.equals(myStr2)); //true
    System.out.println(myStr1.equals(myStr3)); //false
  }
}