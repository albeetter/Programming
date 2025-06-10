package iPoutputs;
import java.text.DecimalFormat;
import java.util.*;

public class Account {
		private String accountName;
		private double accountBalance;
		
		public Account(String accountName, double accountBalance) {
			this.accountName = accountName;
			this.accountBalance = accountBalance;
		}
		public double getBalance() {
			 return accountBalance;
		 }
		
		public void debit(double amount) {
			DecimalFormat df = new DecimalFormat("$###,###.00");
			String wordAmount = df.format(amount);
			
			if (amount<= accountBalance) {
				accountBalance = accountBalance-amount;
				System.out.println("\nsubtracting " + wordAmount + " from " + accountName + " balance");
			}
			else {
				System.out.println("\nsubtracting " + wordAmount + " from " + accountName + " balance");
				System.out.println("Debit amount exceeded balance.");
			}
		}
		 
	}

class AcountRun {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$###,###.00");
		Account account1 = new Account("account1", 150.00);
		Account account2 =  new Account("account2", 500.53);
		
		System.out.println("account1 balance: " +  df.format(account1.getBalance()));
		System.out.println("account2 balance: " +  df.format(account2.getBalance()));
		
		System.out.print("\nEnter withdrawal amount for account1: ");
		account1.debit(input.nextDouble());
		System.out.println("account1 balance: " +  df.format(account1.getBalance()));
		System.out.println("account2 balance: " +  df.format(account2.getBalance()));
		
		System.out.print("\nEnter withdrawal amount for account2: ");
		account2.debit(input.nextDouble());
		System.out.println("account1 balance: " +  df.format(account1.getBalance()));
		System.out.println("account2 balance: " +  df.format(account2.getBalance()));
		
	}
}
		

