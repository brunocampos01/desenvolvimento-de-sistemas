package serializacao;

import java.io.Serializable;

// Fig. 17.5: AccountRecord.java
// AccountRecord class maintains information for one account.

public class Personagem implements Serializable
{
   private int account;
   private String firstName;
   private String lastName;
   private double balance;

   // set account number   
   public void setAccount( int acct )
   {
      account = acct;
   } // end method setAccount

   // get account number   
   public int getAccount() 
   { 
      return account; 
   } // end method getAccount
   
   // set first name   
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // get first name   
   public String getFirstName() 
   { 
      return firstName; 
   } // end method getFirstName
   
   // set last name   
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // get last name   
   public String getLastName() 
   {
      return lastName; 
   } // end method getLastName
   
   // set balance  
   public void setBalance( double bal )
   {
      balance = bal;
   } // end method setBalance

   // get balance   
   public double getBalance() 
   { 
      return balance; 
   } // end method getBalance
} // end class AccountRecord