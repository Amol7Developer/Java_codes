public class WordCount {
  public static void main(String[] args) {

    //declear variables
   String words = "One Two Three Four";
   int countWords = words.split("\\s").length;

    //print word count from string
   System.out.println(countWords);
        
    }
}

