public class ReverseString {
  public static void main(String[] args) {

    //declear variables
    String originalStr = "Hello";
    String reversedStr = "";

    //print original string
    System.out.println("Original string: " + originalStr);
        
    //use for loop (reverse string)
    for (int i = 0; i < originalStr.length(); i++) {

      reversedStr = originalStr.charAt(i) + reversedStr;
    
    }
    
    //print reverse String 
    System.out.println("Reversed string: "+ reversedStr);
  }
}

