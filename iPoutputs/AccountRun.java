package iPoutputs;
import java.text.DecimalFormat;
import java.util.*;

public class AccountRun {
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
