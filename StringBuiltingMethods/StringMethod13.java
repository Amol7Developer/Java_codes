public class StringMethod13 {
      public static void main(String[] args) {
         String myStr1 = "Hello";
         String myStr2 = "HELLO";
         String myStr3 = "Another String";

 //The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.
 //This method returns true if the strings are equal, and false if not.
 //Tip: Use the compareToIgnoreCase() method to compare two strings lexicographically, ignoring case differences.

 
         System.out.println("Java String equalsIgnoreCase() Method used");

         System.out.println(myStr1.equalsIgnoreCase(myStr2));
         System.out.println(myStr1.equalsIgnoreCase(myStr3));
  }
}