public class StringMethod3 {
   public static void main(String[] args) {
    String myStr = "Hello";
   
//The codePointBefore() method returns the Unicode value of the character before the specified index in a string.
//The index of the first character is 1, the second character is 2, and so on.
//Note: The value 0 will generate an error, as this is a negative number (out of reach).

    System.out.println("Java String codePointBefore() Method used");
 
    int result = myStr.codePointBefore(1);
    System.out.println(result);
  
  }
}
