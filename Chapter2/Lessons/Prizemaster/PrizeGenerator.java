

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;

/**
Kyle Szczech
Prize Generator
 */
public class PrizeGenerator
{
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    
    System.out.println("Welcome to the APCSA Prize Simulator");
    System.out.println("------------------------------------");
    System.out.println("Please Enter your name:");
    String name = scan.nextLine();
    
    System.out.print("How much money do you have? $");
    double startBalance = scan.nextDouble();
    
    // Generate a random cash prize 10-100
    // Math.random() gives a number 0 <= and <= 1
    Random Rando = new Random();
    
    int prizeAmount = (int)(Math.random() * 91) +10;
    
    // Generate a random fee between 1 and 5 dollars
    
    int fee = (int)(Math.random() * 5) + 1;
    
    double newBalance = prizeAmount + startBalance - fee;
    
    System.out.println("\n Congratulations " + name + "! Here is your prize:");
    System.out.println("----------------------------------------------------");
    System.out.printf("%-25s %s%n", "Starting Balance", money.format(startBalance));
    System.out.printf("%-25s %s%n", "Processing Fee", money.format(fee));
    System.out.printf("%-25s %s%n", "Prize Amount", money.format(prizeAmount));
    System.out.printf("%-25s %s%n", "New Balance", money.format(newBalance));
    }
    }

   