import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * Write a description of class FindTheFifa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindTheFifa
{
    public static void main(String[] args) throws FileNotFoundException {
   File fifaPlayers = new File("FifaReader.txt");
   Scanner scanFifa = new Scanner(fifaPlayers);
   Scanner scan = new Scanner(System.in);
   String playerName = scan.next();
   int length = playerName.length();
   
   while (playerName != scanFifa.subtring(7, 7 + length)){
   
   String currentLine = scanFifa.next();
   
   
   
}
   
   
   
}}
