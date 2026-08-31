
/**
 * Transform a String
 * Kyle Szczech
 * 8/31/26
 */

import java.util.Scanner;

public class TextTransformer
{
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println(" Welcome to Text Transformer");
      System.out.println("----------------------------");
      
      System.out.println(" Enter a motivational quote:");
      String phrase = scan.nextLine();
      
      int phraseLength = phrase.length();
      System.out.println(" Total Characters with spaces: " + phraseLength);
      
      // replace method returns a brand new string
      String securePhrase = phrase.replace('e', '3');
      securePhrase = securePhrase.replace('a', '@');
      
      System.out.println(" Your new phrase: " + securePhrase);
      System.out.println(" Original phrase: " + phrase);
      
      //get first 5 characters
      
      String firstWord = phrase.substring(0, phrase.indexOf(' '));
      
      System.out.println(" First word: " + firstWord);
      
      String remainder = phrase.substring(phrase.indexOf(' '));
      
      System.out.println(" The other words: " + remainder);
      
      
  }
  
}

