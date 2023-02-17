public class StringMethod6 {
    public static void main(String[] args) {
    String myStr1 = "HELLO";
    String myStr2 = "hello";
  
    //The compareToIgnoreCase() method compares two strings lexicographically, ignoring lower case and upper case differences.
    //The comparison is based on the Unicode value of each character in the string converted to lower case.
    //The method returns 0 if the string is equal to the other string, ignoring case differences. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
  
    System.out.println("Java String compareToIgnoreCase() Method used");
  
    System.out.println(myStr1.compareToIgnoreCase(myStr2));
  
  }

}




