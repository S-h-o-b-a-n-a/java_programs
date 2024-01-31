package programs;

public class BankAccSys {

	    private String accNo;
	    private String accHolder;
	    private double balance;

	    
	    public BankAccSys(String accountNumber, String accountHolder, double initialBalance) {
	        this.accNo = accountNumber;
	        this.accHolder = accountHolder;
	        this.balance = initialBalance;
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount + " to account " + accNo);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	   
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrew $" + amount + " from account " + accNo);
	            } else {
	                System.out.println("Insufficient funds in account " + accNo);
	            }
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	   
	    public void displayInfo() {
	        System.out.println("Account Number: " + accNo);
	        System.out.println("Account Holder: " + accHolder);
	        System.out.println("Balance: $" + balance);
	    }

	    public static void main(String[] args) {
	        
	    	BankAccSys account1 = new BankAccSys("265580", "suraj", 100.00);
	    	BankAccSys account2 = new BankAccSys("975128", "prince", 500.00);

	        
	        account1.deposit(100.00);
	        account2.withdraw(300.00);
	        account1.withdraw(550.00); 

	       
	        account1.displayInfo();
	        account2.displayInfo();
	    } 
	}


