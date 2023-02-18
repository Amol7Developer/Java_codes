public class StringMethod8 {
    public static void main(String[] args) {
    String myStr = "Hello";


//The contains() method checks whether a string contains a sequence of characters.
//Returns true if the characters exist and false if not.

 System.out.println("Java String contains() Method used");
  
    System.out.println(myStr.contains("Hel")); //true.
    System.out.println(myStr.contains("e")); //true.
    System.out.println(myStr.contains("Hi")); //false.
  }
}