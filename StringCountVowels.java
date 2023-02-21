import java.util.Scanner;

public class CountVowels {
  public static void main(String[] args) {
    // create a Scanner object to read input from the user
    Scanner input = new Scanner(System.in);
    
    // prompt the user to enter a string
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    
    // convert the string to lowercase to simplify counting
    str = str.toLowerCase();
    
    // count the number of vowels in the string
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        count++;
      }
    }
    
    // print the number of vowels
    System.out.println("The number of vowels in the string is: " + count);
  }
}
