/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Rohith Preetham Sunkara
 */
public class Account {
    private String firstName;
    private String lastName;
    private double balance;
    
    // Constructor of class Account
    public Account(String firstName, String lastName, double balance)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    
    //Setters
    public void setFirstName(String firstName)
    {
        if(firstName.matches("[a-z A-Z_]+")){
            this.firstName = firstName; 
        }
        else{
            throw new IllegalArgumentException("Invalid character in the first name");
        }
    }
    public void setLastName(String lastName)
    {
        if(lastName.matches("[a-z A-Z_]+")){
            this.lastName = lastName; 
        }
        else{
            throw new IllegalArgumentException("Invalid character in the last name");
        }
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    
    //Getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public double getBalance()
    {
        return balance;
    }
    
    // Method toString
    @Override
    public String toString()
    {
        return("First Name:" + getFirstName() + " " + "Last Name:" + getLastName() + " " + "Balance:" + getBalance());
    }
    
    // Method for deposit
    public double deposit(double deposit)
    {
       if(deposit >= 0){
            System.out.println("Deposit amount is positive");
        }
        else{
            throw new IllegalArgumentException("Cannot deposit a negative number");
        }
       
        balance = deposit + balance;
        return balance;
    }
    
    //Method for withdraw
     public double withdraw(double withdraw)
    {
        if(withdraw <= balance){
            System.out.println("with drawing amount less than Account balance");
        }
        else{
            throw new IllegalArgumentException("Not Sufficient Funds to withdraw");
        }
        if(withdraw >= 0){
            System.out.println("withdraw amount is positive");
        }
        else{
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        }
        
        balance = balance-withdraw;
        return balance;
    }
    
    
}
