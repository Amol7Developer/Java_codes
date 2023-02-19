public class StringMethod15 {
     public static void main(String[] args) {
        String myStr = "Hello planet earth, you are a great planet.";
        
//The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
//Tip: Use the lastIndexOf method to return the position of the last occurrence of specified character(s) in a string.

        System.out.println("Java String indexOf() Method used");
        
        System.out.println(myStr.indexOf("planet"));

  //more >>Find the first occurrence of the letter "e" in a string, starting the search at position 5:
  
      System.out.println(myStr.indexOf("e", 5));      
  }
}