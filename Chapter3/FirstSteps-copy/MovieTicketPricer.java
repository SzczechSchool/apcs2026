
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
        boolean matinee = switch (isMatinee){
            case "y" -> true;
            default -> false;
        };
        
        
        
        //set pass
        System.out.print("Do you have a pass? (y/n)");
        String isPass = scan.next();
        boolean pass = isPass.toLowerCase().equals("y");
        
        double actualPrice;
        
        if ( age < 13 || age >= 65){ 
            actualPrice = switch(format){
            case 1 : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE;
                    default: acutalPrice = REGULAR_PRICE;};
                default: acutalPrice = REGULAR_PRICE;};
            case 2 : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE + IMAX_SURCHARGE;
                    default: acutalPrice = REGULAR_PRICE + IMAX_SURCHARGE;};
                default: acutalPrice = REGULAR_PRICE + IMAX_SURCHARGE;};
            case 3 : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE + IMAX_70MM_SURCHARGE;
                    default: acutalPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;};
                default: acutalPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;};
            default : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE;
                    default: acutalPrice = REGULAR_PRICE;};
                default: acutalPrice = REGULAR_PRICE;};
            };}
            else {
                 actualPrice = switch(format){
            case 1 : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE;
                    default: acutalPrice = REGULAR_PRICE;};
                default: acutalPrice = REGULAR_PRICE;};
            case 2 : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE + IMAX_SURCHARGE;
                    default: acutalPrice = REGULAR_PRICE + IMAX_SURCHARGE;};
                default: acutalPrice = REGULAR_PRICE + IMAX_SURCHARGE;};
            case 3 : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE + IMAX_70MM_SURCHARGE;
                    default: acutalPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;};
                default: acutalPrice = REGULAR_PRICE + IMAX_70MM_SURCHARGE;};
            default : actualPrice = switch(matinee){
                case "y": actualPrice = switch(pass){
                    case "y" : actualPrice = DISCOUNT_PRICE;
                    default: acutalPrice = REGULAR_PRICE;};
                default: acutalPrice = REGULAR_PRICE;};};
        }}}
        
        String gradeLevel = switch(gradeNumber){
            case 1: "first grade";
            case 2: "second grade";
            case 3:;
            case 4:;
            case 5:;
            case 6:;
            case 7:;
            case 8:;
            case 9:;
            case 10:; 
            case 11:;
            case 12: "Seinor";
            defualt:;
        };
            
         


