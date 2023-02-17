public class StringMethod4 {
    public static void main(String[] args) {
        String myStr = "Hello";
        
        //The codePointCount() method returns the number of Unicode values found in a string.
        //Use the startIndex and endIndex parameters to specify where to begin and end the search.
        //The index of the first character is 0, the second character is 1, and so on.

        System.out.println("Java String codePointCount(0, 5) Method used");
        
        int result = myStr.codePointCount(0, 5);
        System.out.println(result);
  
  }
}






