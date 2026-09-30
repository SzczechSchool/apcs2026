import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
/**
 * Write a description of class LedgerProcessor here.
 *
 * Kyle Szczech
 * 9/30
 */
public class LedgerProcessor
{
    static void main(String[] args) throws FileNotFoundException {
        // connecting scanner to a txt file (file must be in the same folder as the class)
        File dataFile = new File("transaction.txt.txt");
        Scanner fileScan = new Scanner(dataFile);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Counter + accumulator variable
        int count = 0;
        double totalSales = 0;
        
        System.out.println("===Daily Transaction Ledger===");
        
        // the loop while run whie there is another line in the file
        while(fileScan.hasNextLine()){ String line = fileScan.nextLine(); double price = Double.parseDouble(line); 
            count++;
            totalSales =+ price;
        System.out.println("Transaction #" + count + ":" + money.format(price));
    }
    fileScan.close();
    double average = totalSales / count;
    
    System.out.println("Total transactons: "+ count);
    System.out.println("Total revenue: "+ totalSales);
    System.out.println("average sale price: "+ average);
    
    }}

