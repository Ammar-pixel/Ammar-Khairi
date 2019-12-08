//import java.awt.Graphics;
//import java.awt.Color;
//import java.awt.Font;

package countersimulation;

/**
 * A class to represent customer in a bank line.  
 * 
 * It will be displayable so all methods must be synchronized.
 * 
 * @author Charles Hoot 
 * @version 4.0
 */

public class Customer
{
    private int arrivalTime;
    private int transactionTime;
    private int customerNumber;
    
   public Customer(int arrival,int transaction,int customer) {
	   arrivalTime= arrival;
	   transactionTime= transaction;
	   customerNumber=customer;
   }
    
    
    public int getArrivalTime() // Getters for arrivalTime
    {
        return arrivalTime;
    }
    
    public int getTransactionTime() // Getters for transactionTime
    {
        return transactionTime;
    }
    
    public int getCustomerNumber() // Getters for getCustomerNumber
    {
        return customerNumber;
    }
 
}
