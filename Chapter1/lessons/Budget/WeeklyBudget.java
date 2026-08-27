

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Weekly Budget
 *
 * @Kyle Szczech
 * 8/21/26
 */
public class WeeklyBudget
{
    // Calculate lunch budget
    public static void main(String[] args){
        String name;
        double allowance, lunchPrice, totalCost, remaining;
        int lunchesPerWeek;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // Instantiate the Scanner object to read from the keyboard
        Scanner scanf = new Scanner(System.in);
        
        // Read a String (Object)
        System.out.print("Enter your name");
        name = scanf.nextLine();
        
        //Read doubles
        System.out.print("Enter your weekly allowance: $");
        allowance = scanf.nextDouble();
        
        System.out.print("Enter the price of one school lunch: $");
        lunchPrice = scanf.nextDouble();
        
        // Reading integer
        System.out.print("Enter the weekly number of lunches: $");
        lunchesPerWeek = scanf.nextInt();
        
        // Calculate cost and remaining
        totalCost = lunchesPerWeek * lunchPrice;
        remaining = allowance - totalCost;
        
        System.out.printf("%n--- Weekly Budget Summary for %s ---%n",name);
        
        System.out.printf("%-25s %s%n", "Weekly Allowance", money.format(allowance));
        System.out.printf("%-25s %s%n", "Balance Spent On Lunches", money.format(totalCost));
        System.out.printf("%-25s %s%n", "Remaining Balance", money.format(remaining));
        
        
    }
}
  