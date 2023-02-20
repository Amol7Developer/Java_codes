public class StringMethod17 {
    public static void main(String[] args) {
    String myStr = "Hello planet earth, you are a great planet.";
   
   //The lastIndexOf() method returns the position of the last occurrence of specified character(s) in a string.
   //Tip: Use the indexOf method to return the position of the first occurrence of specified character(s) in a string.
   
    System.out.println("Java String lastIndexOf() Method used");
   
    System.out.println(myStr.lastIndexOf("planet"));
  
  //More example :Find the last occurrence of "e" in a string, starting the search at position 5:

    System.out.println(myStr.lastIndexOf("e", 5));
  
  }
}