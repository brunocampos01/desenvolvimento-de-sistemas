package serializacao;

import java.io.Serializable;

public class Personagem implements Serializable
{
   private int account;
   private String firstName;
   private String lastName;
   private double balance;

   // set  
   public void setAccount( int acct )
   {
      account = acct;
   }

   // get
   public int getAccount() 
   { 
      return account; 
   }
   
   // set  
   public void setFirstName( String first )
   {
      firstName = first;
   }

   // get
   public String getFirstName() 
   { 
      return firstName; 
   }
   
   // set 
   public void setLastName( String last )
   {
      lastName = last;
   }

   // get 
   public String getLastName() 
   {
      return lastName; 
   }
   
   // set
   public void setBalance( double bal )
   {
      balance = bal;
   }

   // get
   public double getBalance() 
   { 
      return balance; 
   }
}