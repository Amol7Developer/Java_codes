public class StringMethod2 {
    public static void main(String[] args) {
    String myStr = "Hello";

//The codePointAt() method returns the Unicode value of the character at the specified index in a string.
//The index of the first character is 0, the second character is 1, and so on.

    System.out.println("Java String codePointAt() Method used");
    int result = myStr.codePointAt(0);
    System.out.println(result);
  }
}