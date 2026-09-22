
/**
 * Write a description of class MovieTicketPricer here.
 * 9/21
 * Kyle Szczech
 * 
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class MovieTicketPricer
{
    public static void main(String[] args){
        //Create constant variable
        final double REGULAR_PRICE = 12.50;
        final double DISCOUNT_PRICE = 8.00;
        final double IMAX_SURCHARGE = 5.00;
        final double IMAX_70MM_SURCHARGE = 8.00;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);
        System.out.println("---Movie Ticekt Calculator---");
        System.out.println(" Select Movie Format");
        System.out.println(" 1 - Standard Format");
        System.out.println(" 2 - IMAX");
        System.out.println(" 3 - IMAX 70mm");
        System.out.println(" Enter Choice(1-3)");
        int format = scan.nextInt();
        
        System.out.print("Enter the customer's age: ");        
        int age = scan.nextInt();
        
        // set matinee to true if the user enters "y"
        System.out.print("Is this a matinee showtime? (y/n)");
        String isMatinee = scan.next();
        boolean matinee = false;
        if ( isMatinee.toLowerCase().equals("y")){
            matinee = true;
        }
        //set pass
        System.out.print("Do you have a pass? (y/n)");
        String isPass = scan.next();
        boolean pass = isPass.toLowerCase().equals("y");
        
        double actualPrice;
        if(format == 1){
             if ( pass && matinee || age < 13 || age >= 65){
            actualPrice = DISCOUNT_PRICE;
            System.out.println(" Your ticket cost: " + DISCOUNT_PRICE);
        }
        else{
            actualPrice = REGULAR_PRICE;
        System.out.println(" Your ticket cost: " + REGULAR_PRICE);
        }
        
        
    }
    else if ( format == 2){
         if ( pass && matinee || age < 13 || age >= 65){
            actualPrice = DISCOUNT_PRICE + IMAX_SURCHARGE;
            System.out.println(" Your ticket cost: " + DISCOUNT_PRICE + " (IMAX surcharge applied)");
        }
        else{
            actualPrice = REGULAR_PRICE + IMAX_SURCHARGE;
        System.out.println(" Your ticket cost: " + REGULAR_PRICE + " (IMAX surcharge applied)");
    }
    
}
else if(format == 3){
         if ( pass && matinee || age < 13 || age >= 65){
            actualPrice = DISCOUNT_PRICE + IMAX_70MM_SURCHARGE;
            System.out.println(" Your ticket cost: " + DISCOUNT_PRICE + " (IMAX70mm surcharge applied)");
        }
        else{
            actualPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;
        System.out.println(" Your ticket cost: " + REGULAR_PRICE + " (IMAX70mm surcharge applied)");
    }}
else{ if ( pass && matinee || age < 13 || age >= 65){
            actualPrice = DISCOUNT_PRICE;
            System.out.println(" Your ticket cost: " + DISCOUNT_PRICE);
        }
        else{
            actualPrice = REGULAR_PRICE;
        System.out.println(" Your ticket cost: " + REGULAR_PRICE);}}}}


