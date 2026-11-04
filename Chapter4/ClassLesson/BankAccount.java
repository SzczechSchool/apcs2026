
/**
 * IDK Bo
 *
 * Kyle Szczech
 * 11/4
 */
//Class Head
public class BankAccount
{
  // variables
  private double balance;
  private String accountHolder;
  private int transactions;
  
  // Constant definition
  private static final double MIN_BAL= 0.0;
  
  //Step 3: Create structs
  //Default Constructor ()
  public BankAccount(){
      //this refers to current object
      this.balance = 1738.0;
      this.accountHolder = "Unamed";
      this.transactions = 2;
    }
  public BankAccount(String nme, int trans, double bal){
       if( bal >= MIN_BAL){
      this.balance = bal;
    }
    else{
        balance = MIN_BAL;
    }
      this.accountHolder = nme;
      this.transactions = trans;
  }
  //withdraw method
  public boolean withdraw(double withdraw){
      if (withdraw > 0 && balance - withdraw >= MIN_BAL){
          balance -= withdraw;
          transactions++;
          return true;
      }
      return false ;
  }
  }
  
  

