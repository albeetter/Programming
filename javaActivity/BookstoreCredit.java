package src.javaActivity;
import java.util.Scanner;
public class BookstoreCredit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name of student: ");
		String sname = input.nextLine();
		
		System.out.print("Enter student's grade point average: ");
		double gpa = input.nextDouble();
		
		displayCredit(sname, gpa);
		
	}
	
	public static void displayCredit(String stud, double gpave) {
		double credit = gpave*10;
		
		System.out.println("\nStudent Name: " + stud);
		System.out.println("GPA: " + gpave);
		System.out.println("Bookstore Credit: " + credit);
	}

}
