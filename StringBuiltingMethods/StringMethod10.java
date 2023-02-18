public class StringMethod10{
    public static void main(String[] args) {
    char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
    String myStr2 = "";


//The copyValueOf() method returns a String that represents the characters of a char array.
//This method returns a new String array and copies the characters into it.

    System.out.println("Java String copyValueOf() Method used");

    myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
    System.out.println("Returned String: " + myStr2);  
  }
}