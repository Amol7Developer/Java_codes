public class StringMethod5 {
    public static void main(String[] args) {
    String myStr1 = "Hello";
    String myStr2 = "Hello";
  
    // The compareTo() method compares two strings lexicographically.
    //The comparison is based on the Unicode value of each character in the strings.
    //The method returns 0 if the string is equal to the other string. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
  
     System.out.println("Java String compareTo() Method used");
  
    System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
  
  }
}