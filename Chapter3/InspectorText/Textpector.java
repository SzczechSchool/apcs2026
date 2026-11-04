import java.util.Scanner;
/**
 * Uses iteration though strings to inspect text
 *
 * @Kyle
 * @10/5
 */
public class Textpector
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Inspector Text ===");
        System.out.println("please enter a word or phrase");
        
        String phrase = scan.nextLine();
        //Determine the length
        
        System.out.println(" The length is: " + phrase.length());
        
        int count = 0;
        String vowels = "aeiou";
        for ( int i = 0; i < phrase.length(); i++) {
            String ch = phrase.substring(i,i+1);
            for ( int w = 0; w < vowels.length(); w++){
                String vch = vowels.substring(w,w + 1);
                if ( vch.toLowerCase().equals(ch)){
                    count++;
                }
            }
        }
        System.out.println(" your program has: " + count + "vowels");
        
        //search word phrase for a given word phrase
        System.out.println("Enter a search term");
        String term = scan.nextLine();
        
        int foundIndex = phrase.indexOf(term);
        if( foundIndex != -1) {
            //Extract from foundIndex to the end of the string
            String phraseWithSearchAtEnd = phrase.substring(0,foundIndex) + phrase.substring(foundIndex + term.length()) + term;
            System.out.println("phraseWithSearchAtEnd");
        }
        System.out.print(" Please enter a second word/phrase to compare:");
        String secondWord = scan.nextLine();
        if (phrase.equals(secondWord)){
            System.out.println("The two words/phrases are equal");
        } else{
                int emp = phrase.compareTo(secondWord);
                if ( emp < 0){
                    System.out.println(phrase +" comes before");
                }
                else{
                    System.out.print( phrase + " comes after");
                }
            }
        String potato = "1stpotatoe";
        int counta = 0;
        for( int i = 0; i < potato.length(); i++){
            if ( potato.substring(i, i+1).equals("a")){
                counta++;
            }
        }
    }
    }

