class LengthCount {
  public static void main(String[] args) {

      //declear variables
    String str = "Hello, World!";
    int length = 0;

    //for loop 
    for (int i = 0; str.charAt(i) != '\0'; i++) {
      length++;
    }

    //print string length
    System.out.println("The length of the string is: " + length);
  }
}
