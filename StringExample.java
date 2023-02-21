public class StringExample {
  public static void main(String[] args) {
    // create a string variable
    String message = "Hello, world!";
    
    // print the length of the string
    int length = message.length();
    System.out.println("The length of the string is: " + length);
    
    // print the uppercase version of the string
    String uppercase = message.toUpperCase();
    System.out.println("The uppercase version of the string is: " + uppercase);
    
    // replace a substring within the string
    String replaced = message.replace("world", "Java");
    System.out.println("The string with the replacement is: " + replaced);
  }
}
