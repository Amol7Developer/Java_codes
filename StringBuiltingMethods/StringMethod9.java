public class StringMethod9 {
    public static void main(String[] args) {
    String myStr = "Hello";

    //The contentEquals() method searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer.
    //Returns true if the characters exist and false if not.
    
    System.out.println("Java String contentEquals() Method used");

    System.out.println(myStr.contentEquals("Hello")); //True
    System.out.println(myStr.contentEquals("e")); //false
    System.out.println(myStr.contentEquals("Hi")); //false
  }
}